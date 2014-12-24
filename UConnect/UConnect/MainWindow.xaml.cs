using System;
using System.Collections.Generic;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;
using System.Diagnostics;
using System.Net.NetworkInformation;

namespace UConnect
{
	/// <summary>
	/// Interaction logic for MainWindow.xaml
	/// </summary>
	public partial class MainWindow : Window
	{
		
		private bool _hostednetwork_status = false;
		
		public MainWindow()
		{
			this.InitializeComponent();
			refresh_all();
			// Insert code required on object creation below this point.
		}
		private void show_author_info(Object sender, RoutedEventArgs e){
			MessageBox.Show("Author  : Utkal Sinha\nWebsite : www.utkalsinha.com","Author of Application",MessageBoxButton.OK,MessageBoxImage.Information);
		}
		
		private void _start_hosted_network(Object sender, RoutedEventArgs e){
			// Start hosted network
			if(!_hostednetwork_status){
				ProcessStartInfo _pStartInfo = new ProcessStartInfo("cmd.exe");
				_pStartInfo.RedirectStandardInput = true;
				_pStartInfo.RedirectStandardOutput = true;
				_pStartInfo.CreateNoWindow = true;
				_pStartInfo.UseShellExecute = false;
				Process p = Process.Start(_pStartInfo);
				
				
				if(p != null){
						p.StandardInput.WriteLine("netsh wlan start hostednetwork");
						p.StandardInput.Close();
						// check for successfull completion of the command
						var _CMD_output =  p.StandardOutput.ReadToEnd().ToString();
						var _line_num = _CMD_output.Split('\n').Length; // count the number of lines returned
						
						if(_line_num >3){
							string[] _cs = _CMD_output.Split('\n'); // spliting string into lines				
								if(_cs[4].TrimStart(' ').TrimEnd(' ','\r').ToLower() == "the hosted network started."){
									// set the hostednetwork status flag
									_hostednetwork_status = true;
									MessageBox.Show("Hostednetwork has been successfully started!","Information",MessageBoxButton.OK,MessageBoxImage.Information);	
									refresh_all();
								}
								else{
									MessageBox.Show("Failed to start the Hostednetwork.\nPlease try again in administrator mode !","Information",MessageBoxButton.OK,MessageBoxImage.Information);
								}
													
						}
				}			
			}
			else{
				MessageBox.Show("HostedNetwork is already running!","Information",MessageBoxButton.OK,MessageBoxImage.Information);			
			}
		}
		
		private void _stop_hosted_network(Object sender, RoutedEventArgs e){
			// stop hosted network
			if(_hostednetwork_status){
				ProcessStartInfo _pStartInfo = new ProcessStartInfo("cmd.exe");
				_pStartInfo.RedirectStandardInput = true;
				_pStartInfo.RedirectStandardOutput = true;
				_pStartInfo.CreateNoWindow = true;
				_pStartInfo.UseShellExecute = false;
				Process p = Process.Start(_pStartInfo);
				
				
				if(p != null){
					p.StandardInput.WriteLine("netsh wlan stop hostednetwork");
					p.StandardInput.Close();
					
					// check for successfull completion of the command
					var _CMD_output =  p.StandardOutput.ReadToEnd().ToString();
					var _line_num = _CMD_output.Split('\n').Length; // count the number of lines returned
					
					if(_line_num >3){
						string[] _cs = _CMD_output.Split('\n'); // spliting string into lines				
							if(_cs[4].TrimStart(' ').TrimEnd(' ','\r').ToLower() == "the hosted network stopped."){
								// reset the hostednetwork status flag
								_hostednetwork_status = false;
								MessageBox.Show("Hostednetwork has been successfully stopped!","Information",MessageBoxButton.OK,MessageBoxImage.Information);	
								refresh_all();
							}
							else{
								MessageBox.Show("Failed to stop the Hostednetwork.\nPlease try again in administrator mode !","Information",MessageBoxButton.OK,MessageBoxImage.Information);
							}							
					}		
				}			
			}
			else{
				MessageBox.Show("HostedNetwork is has already been stopped!","Information",MessageBoxButton.OK,MessageBoxImage.Information);			
			}			
		}
		
		private void _getpass_hosted_network(Object sender, RoutedEventArgs e){
			// get password of hosted network
			ProcessStartInfo _pStartInfo = new ProcessStartInfo("cmd.exe");
			_pStartInfo.RedirectStandardInput = true;
			_pStartInfo.RedirectStandardOutput = true;
			_pStartInfo.CreateNoWindow = true;
			_pStartInfo.UseShellExecute = false;
			Process p = Process.Start(_pStartInfo);		
			
				if(p != null){
					p.StandardInput.WriteLine("netsh wlan show hostednetwork setting=security");
					p.StandardInput.Close();
					var _CMD_output =  p.StandardOutput.ReadToEnd().ToString();
					var _line_num = _CMD_output.Split('\n').Length; // count the number of lines returned
					
					if(_line_num >9){
						
						string[] _cs = _CMD_output.Split('\n'); // spliting string into lines				
						var _pasword_row_words_length = _cs[10].Split(':').Length;
						
						if(_pasword_row_words_length == 2){
							
							string[] _password_row_words = _cs[10].Split(':');
							if(_password_row_words[0].TrimStart(' ').TrimEnd(' ').ToLower() == "user security key"){
								string _password_value = _password_row_words[1].Replace("\"",string.Empty);
								_password_value = _password_value.TrimStart(' ').TrimEnd('\r');
								MessageBox.Show("HostedNetwork Password(Key) = "+_password_value,"Information",MessageBoxButton.OK,MessageBoxImage.Information);												
								refresh_all();
							}
						}
					}
				}			
		}

		private void Close_button_MouseLeftButtonUp(object sender, System.Windows.Input.MouseButtonEventArgs e)
		{
			// TODO: Add event handler implementation here.
			this.Close();
		}

		private void minimize_button_MouseLeftButtonUp(object sender, System.Windows.Input.MouseButtonEventArgs e)
		{
			// TODO: Add event handler implementation here.
			this.WindowState = System.Windows.WindowState.Minimized;

		}



		private void MainPanel_MouseLeftButtonDown(object sender, System.Windows.Input.MouseButtonEventArgs e)
		{
			// TODO: Add event handler implementation here.
			this.DragMove();
		}

		private void Control_button_Click(object sender, System.Windows.RoutedEventArgs e)
		{
			// TODO: Add event handler implementation here.
						
			if(hotSpot_textBox.Text.Length >0){
					if(password_textBox.Text.Length > 8){
						// Create the Hosted network
						Create_hostedNetwork();		
					}
					else{
						MessageBox.Show("Invalid password entered.\nPassword length should be greater than 8 characters !","Invalid Password",MessageBoxButton.OK,MessageBoxImage.Information);
					}	
			}
			else{
				MessageBox.Show("Hotspot name (or SSID ) is empty !","Hotspot Name Missing",MessageBoxButton.OK,MessageBoxImage.Information);
			}
		}
		
		private void Create_hostedNetwork()
		{
			// TODO: Add event handler implementation here.
			
			ProcessStartInfo _pStartInfo = new ProcessStartInfo("cmd.exe");
			_pStartInfo.RedirectStandardInput = true;
			_pStartInfo.RedirectStandardOutput = true;
			_pStartInfo.CreateNoWindow = true;
			_pStartInfo.UseShellExecute = false;
			Process p = Process.Start(_pStartInfo);
			
			
			if(p != null){
				
				p.StandardInput.WriteLine("netsh wlan set hostednetwork mode=allow ssid="+hotSpot_textBox.Text+" key="+password_textBox.Text+" keyUsage=persistent");
				p.StandardInput.WriteLine("netsh wlan start hostednetwork");
				p.StandardInput.Close();
				// check for successfull completion of the command
				var _CMD_output =  p.StandardOutput.ReadToEnd().ToString();
				var _line_num = _CMD_output.Split('\n').Length; // count the number of lines returned
				if(_line_num >5){
						string[] _cs = _CMD_output.Split('\n'); // spliting string into lines				
							if(_cs[4].TrimStart(' ').TrimEnd(' ','\r').ToLower() == "the hosted network mode has been set to allow."){
								if(_cs[5].TrimStart(' ').TrimEnd(' ','\r').ToLower() == "the ssid of the hosted network has been successfully changed."){
									if(_cs[6].TrimStart(' ').TrimEnd(' ','\r').ToLower() == "the user key passphrase of the hosted network has been successfully changed."){	
										//_start_hosted_network(null,null);
										refresh_all();
										MessageBox.Show("Successfully created a new hostednetwork !","Information",MessageBoxButton.OK,MessageBoxImage.Information);
									}
								}

							}
							else{
								MessageBox.Show("Failed to create a new hostednetwork.\nPlease try again in administrator mode !","Information",MessageBoxButton.OK,MessageBoxImage.Information);
							}							
				}
			}

		}
		
		private void refresh_all(){
			// TODO: Add event handler implementation here.
			ProcessStartInfo _pStartInfo = new ProcessStartInfo("cmd.exe");
			_pStartInfo.RedirectStandardInput = true;
			_pStartInfo.RedirectStandardOutput = true;
			_pStartInfo.CreateNoWindow = true;
			_pStartInfo.UseShellExecute = false;
			Process p = Process.Start(_pStartInfo);		
			
				if(p != null){
					p.StandardInput.WriteLine("netsh wlan show hostednetwork");
					p.StandardInput.Close();
					var _CMD_output =  p.StandardOutput.ReadToEnd().ToString();
					var _line_num = _CMD_output.Split('\n').Length; // count the number of lines returned
					
					if(_line_num >14){
						
						string[] _cs = _CMD_output.Split('\n'); // spliting string into lines				
						var _ssid_row_words_length = _cs[8].Split(':').Length;
						
						if(_ssid_row_words_length == 2){
							
							string[] _ssid_row_words = _cs[8].Split(':');
							if(_ssid_row_words[0].TrimStart(' ').TrimEnd(' ').ToLower() == "ssid name"){
								string _hosted_network_name = _ssid_row_words[1].Replace("\"",string.Empty);
								_hosted_network_name = _hosted_network_name.TrimStart(' ').TrimEnd('\r');
								
								
								
								available_networks_listBox.IsEnabled = true;
								available_networks_listBox.Items.Insert(0,_hosted_network_name);
								if(available_networks_listBox.Items.Count>1){
									available_networks_listBox.Items.RemoveAt(1);
								}
							}
							else{
								
								available_networks_listBox.IsEnabled = false;
							}
						}
						
						var _status_row_words_length = _cs[15].Split(':').Length;  // checking the hostednetwork status
						if(_status_row_words_length == 2){
							
							string[] _status_row_words = _cs[15].Split(':');
							if(_status_row_words[0].TrimStart(' ').TrimEnd(' ').ToLower() == "status"){

								string _status = _status_row_words[1].TrimStart(' ').TrimEnd(' ').ToLower();
								_status = _status.TrimEnd('\r');
								if(_status == "not started"){		
									_hostednetwork_status = false; // false to indicate that the hsted network is not started
								}
								else{
									_hostednetwork_status = true; // true to indicate that the hosted network is started
									
								}
							}
							
							if(_hostednetwork_status == true){  // Get the client numbers
								
								var _client_row_words_length = _cs[19].Split(':').Length;
								if(_client_row_words_length == 2){
									string[] _client_row_words = _cs[19].Split(':');
									if(_client_row_words[0].TrimStart(' ').TrimEnd(' ').ToLower() == "number of clients"){
		
										string _number_of_clients = _client_row_words[1].TrimStart(' ').TrimEnd(' ').ToLower();
										_number_of_clients = _number_of_clients.TrimEnd('\r');
										num_of_clients_label.Visibility = System.Windows.Visibility.Visible;
										num_clients_val.Visibility = System.Windows.Visibility.Visible;										
										num_clients_val.Text = _number_of_clients;
									}									
								}
								
							}
							else{
								num_of_clients_label.Visibility = System.Windows.Visibility.Hidden;
								num_clients_val.Visibility = System.Windows.Visibility.Hidden;
							}
						}
					}
				}
		//	NetworkInterface[] _Network_adapters = NetworkInterface.GetAllNetworkInterfaces();
		//	foreach(NetworkInterface _ni in _Network_adapters){
				// for windows 8 and later : microsoft hosted network virtual adapter 
				// for windows 7 : microsoft virtual wifi miniport adapter
				

				
	//		}

			}

		private void refres_button_Click(object sender, System.Windows.RoutedEventArgs e)
		{
			// TODO: Add event handler implementation here.
			refresh_all();
		}
		}

	}