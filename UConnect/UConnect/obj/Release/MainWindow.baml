   M S B A M L   `   `   `  ���� C  ?UConnect, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null#clr-namespace:UConnectUConnect  a ]PresentationFramework.Aero, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35gJclr-namespace:Microsoft.Windows.Themes;assembly=PresentationFramework.AeroMicrosoft.Windows.Themes     UConnect.MainWindow   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     (localclr-namespace:UConnect     oMicrosoft_Windows_ThemesJclr-namespace:Microsoft.Windows.Themes;assembly=PresentationFramework.Aero     @d2http://schemas.microsoft.com/expression/blend/2008     Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     -     �Name$  Window�� � Title$ UConnect��$	��608��$��376.333�� � WindowStyle$
 None=� � AllowsTransparency . $��1q����	#FFFF0097 � Icon$ logo.png�� � WindowStartupLocation$ CenterScreen=� � 
ResizeMode$ NoResize=� � 	Resources    MyButtonStyle �� 
TargetType	 �� Property
 �� Value �� 
TargetType ��Name J� SnapsToDevicePixels �� Triggers P� Property P� Value �� 
TargetName  ComboBoxFocusVisual �� StrokeDashArray  ButtonNormalBackground �� EndPoint �� 
StartPoint � Color � Offset  ButtonNormalBorder �� Color  DownArrowGeometry   ComboBoxReadonlyToggleButton+  %Microsoft.Windows.Themes.ButtonChrome  Name J� IsMouseOver   RenderMouseOver   RenderPressed   BorderBrush   
Background F�Name  TextBoxBorder � MappingMode  ComboBoxEditableTextBox  ��Name  ComboBoxToggleButton!   RoundCorners 	 ComboBoxEditableTemplate" �Name# � ColumnDefinitions$ �Name% � AllowsTransparency& �� RelativeSource5  /Microsoft.Windows.Themes.SystemDropShadowChrome'  Name(   Color) �� MaxDropDownHeight* �� ElementName+ ��Name, �� ClearTypeHint- ��Name-  'System.Windows.Input.KeyboardNavigation.   DirectionalNavigation,  &Microsoft.Windows.Themes.ListBoxChrome/  Name0   BorderBrush1   BorderThickness2   
Background3   RenderMouseOver4 J� IsKeyboardFocusWithin5   RenderFocused6 ��Name7 �� 
IsReadOnly8 d� 	IsChecked9 �� Mode: P� 
SourceName 
 ComboBoxItemStyle1; �� AncestorType< �� Padding  
ListBorder= � RowDefinitions> �� AllowsColumnReorder!? �� ColumnHeaderContainerStyle@ �� ColumnHeaderToolTipA �� ColumnHeaderStringFormatB �� ColumnHeaderContextMenuC �� ColumnHeaderTemplateD �� Columns#E �� ColumnHeaderTemplateSelectorF ��NameG �� CanContentScrollH ��NameI � CursorJ �� ScrollableWidthK � MaximumL � MinimumM �� Orientation,N �� %ComputedHorizontalScrollBarVisibilityO �� ViewportWidthP �� ViewportSizeQ � ValueR �� ScrollableHeight*S �� #ComputedVerticalScrollBarVisibilityT �� ViewportHeight  MyListViewStyle1  ExpanderRightHeaderStyleU � LayoutTransformV �� AngleW A�Name  ExpanderUpHeaderStyle  ExpanderLeftHeaderStyle  ExpanderHeaderFocusVisual  ExpanderDownHeaderStyle  MyExpanderStyle1X �� CornerRadiusY d�NameZ � FocusVisualStyle[ ��Name  RefreshButtonStyle\ ��Name  ButtonStyle12��%�+  &	        &	 w    &	 �    &	 X    &	 m    &	 �    7  &	 �    &	 [    &	 �    7  &		 ~    7  7  &	
 �    &	 �    (�� �    *'%GridView.GridViewScrollViewerStyleKey+)&	 �    7  &	 �    &	 �    &	 z    &	 o     &	 �     &	 �#    7  7  7  7  7  &	 (    &	 F)    �� " ��.��� 	 � ��
 �� " ��.R�� .+��� $ 	rectangle�����	#FF00A4CE���	#FF4E4E4E�� #��z����. # z #��z�� P�  �@J�	IsFocused . P�  �@��IsDefaulted . P�  �@J�IsMouseOver . . ��� $ 	rectangle��	 � ��
 �	#FF545454P�  � �� . . ��� $ 	rectangle��	 � ��
 �	#FF232323P�  � {� .  �� .��� 	 � ��
 �� .R��� $��4,4,21,4q� . #��� ��$��1��$	 1 2R��� $	 0,1&�$	 0,0&�.��� $ #F3F3F3��$ 0Q�� $ #EBEBEB��$	 0.5Q�� $ #DDDDDD��$	 0.5Q�� $ #CDCDCD��$ 1Q��� $ 	#FF707070���M 0 0 L 3.5 4 L 7 0 Z��� " d�.��� 	 �@�OverridesDefaultStyle
 . �� 	 � ��
 .  �� 	 � |�
 .  �� 	 �@��	ClickMode$
 Press=��� 	 � ��
 �� " d�.R�  $ Chrome��# z # z�� .  �	#FF00A4CE Z� ._�� $��Right=�#��� r�.+�F� $ Arrow��8��  
���   �$��Center=�$��3,1,0,0q�$��Center=� �� $
 0,20&�$ Absolute=�$	 0,0&�.��� $ #ABADB3��$
 0.05Q�� $ #E2E3EA��$
 0.07Q�� $ #E3E9EF��$ 1Q��� " ��.��� 	 �@�OverridesDefaultStyle
 . �� 	 �@J�	AllowDrop
 . �� 	 � ��$
 0���� 	 � ��$
 0���� 	 �@�FocusVisualStyle
 Z� �� 	 �@��PanningMode$
 VerticalFirst=��� 	 �@��IsFlicksEnabled
 .  �� 	 � ��
 �� " ��.R��� $  PART_ContentHost��
������ |�.  $��Hidden=�$��Hidden=��� " d�.��� 	 �@�OverridesDefaultStyle
 . �� 	 � ��
 .  �� 	 � |�
 .  �� 	 �@��	ClickMode$
 Press=��� 	 � ��
 �� " d�.R�  $ Chrome��# z��# z��# z # z��! .   . #��� r�._�F� $ Arrow��8��  
���   �$��Center=�$��0,1,0,0q�$��Center=� P�  �@d�	IsChecked$
 trueY�. ��� $ Chrome��	 �@ RenderPressed
 . P�  � {� .  . ��� $ Arrow��	 � ��
 �#AFAFAF�� " ��.R�� $" 	Placement�� . # �� $��* ��� $
��Auto �.+�� $$ 
PART_Popup��% . $��2��#��� .�$��Bottom=����� *IsDropDownOpen+& �� *TemplatedParent+.��  $
' Shdw��$( Transparent��#��z) ���� *ActualWidth+$* 	Placement��._��� $+ DropDownBorder��#��� ��$��1q�#��� ��._��� $  DropDownScrollViewer��.��� $, Enabled=�.+��� $
��Left=�$��0��$	��Top=�$��0��.+��� $ 
OpaqueRect������ *
Background+$* DropDownBorder������ *ActualHeight+$* DropDownBorder������ *ActualWidth+$* DropDownBorder���� $- ItemsPresenter��$. 	Contained=�# z   $/ Border��#0 z��#1 z��#2 z��$��2��#3 z #5 z4 �� $6 PART_EditableTextBox��#��z��#��z��8��  #��z��7 �� *
IsReadOnly+& �� *TemplatedParent+d� $��1��8�� 8 �� *IsDropDownOpen+$9 TwoWay=�& �� *TemplatedParent+ P�  �@J�IsKeyboardFocusWithin . . ��� 	 � ��

 �   �P�  �@��IsDropDownOpen . . ��� $ Border��	 �@ RenderFocused
 . P�  �@��HasItems .  . ��� $ DropDownBorder��	 � ��$
 95��P�  � {� .  . ��� #
 � ��	 � ���� 	 � ��
 �	#FFF4F4F4P�  �@��
IsGrouping . . ��� 	 � ��
 .  P� $: 
PART_Popup�� �@�HasDropShadow . . ��� $
 Shdw��	 � ��$
 0,0,5,5q��� $
 Shdw��	 �@ Color$
 	#71000000��P� $: DropDownScrollViewer�� � �� .  . ��� $ 
OpaqueRect��
 �� *VerticalOffset+$* DropDownScrollViewer��	 �@��Top�� $ 
OpaqueRect��
 �� *HorizontalOffset+$* DropDownScrollViewer��	 �@��Left�� " ��.��� 	 � ��
 �� *HorizontalContentAlignment+& �� "; ���� 	 � ��
 �� *VerticalContentAlignment+& �� "; ���� 	 � ��$
 3,0,3,0q��� 	 � ��

 ���� �� 	 � ��
 �� " ��.R��� $+ Bd��#��z��#��z��#��z��#< z�� . ._��� #��z��# z #��z�� P�  �@��IsHighlighted . . ��� $ Bd��#
 � ��	 � ���� #
 � ��	 � ��P�  � {� .  . ��� #
 � ��	 � ���� $ #828790���� " ��.��� 	 � |�
 .  �� 	 � ��
 �� " ��.R�� #��z�� . # �� $��* ��� $
��Auto �= �� $��* ��� $
��Auto �.+�]� #��z��.+��� $	��Top=�|�.  $��Hidden=�$��Hidden=�.���� $��2,0,2,0q�# z > �� **(TemplatedParent.View.AllowsColumnReorder+& �� *TemplatedParent+? �� *1/TemplatedParent.View.ColumnHeaderContainerStyle+& �� *TemplatedParent+@ �� **(TemplatedParent.View.ColumnHeaderToolTip+& �� *TemplatedParent+A �� */-TemplatedParent.View.ColumnHeaderStringFormat+& �� *TemplatedParent+B �� *.,TemplatedParent.View.ColumnHeaderContextMenu+& �� *TemplatedParent+C �� *+)TemplatedParent.View.ColumnHeaderTemplate+& �� *TemplatedParent+D �� *TemplatedParent.View.Columns+& �� *TemplatedParent+E �� *31TemplatedParent.View.ColumnHeaderTemplateSelector+& �� *TemplatedParent+�� $!F PART_ScrollContentPresenter��#G z��#��z��#��z��$. Local=�# z �� $H PART_HorizontalScrollBar��$I Arrow��#K zJ $	L 0.0Q�$M 
Horizontal=�$��1��#y�zN #P zO Q �� *HorizontalOffset+$9 OneWay=�& �� *TemplatedParent+�� $H PART_VerticalScrollBar��$I Arrow��$��1��#K zR $	L 0.0Q�$M Vertical=�#y�zS #P zT Q �� *VerticalOffset+$9 OneWay=�& �� *TemplatedParent+]� $��1����.  $��1������ *
Background+$* PART_VerticalScrollBar��.+��� $
��Left=�
�������#y�zS $��1���� $	��Top=�
�������$��1��#y�zN �� " ��.��� 	 � ��#
 � ���� 	 � ��8
   �� 	 � ��$
 1q��� 	 � ��
 �	#FF042271�� 	 � ��$

 Auto=��� 	 � ��$

 Auto=��� 	 � ��
 . �� 	 �@��PanningMode$

 Both=��� 	 �@��IsFlicksEnabled
 .  �� 	 � ��$
 Center=��� 	 � ��
 �� " ��.R�  $/ Bd��#0 z��#1 z��#2 z��#3 z #5 z4  . ._��� #��z��#��� $�.���� # z  P�  �@��
IsGrouping . . ��� 	 � ��
 .  P�  � {� .  . ��� $ Bd��#
 � ��	 �@ 
Background�� " d�.��� 	 � ��
 �� " d�.R��� #< z��._�� 
������  .  = �� $��19 ��� $��* �.+�� U V� ~�X� �� $	V -90Q�.+�A� $W circle��$��Center=�$��19��
�������$��Center=�$��19��F� $ arrow��"����@B `� � �D @KL � z `� 	$��Center=� .  ���#666$��2��$��Center=��� $��Center=�$��0,4,0,0q�$��1����.  . $	��Top=� P�  �@d�	IsChecked$
 trueY�. ��� $ arrow��	 � ��"
 ��@B  �D � �D @B � z  �D 	P�  �@J�IsMouseOver . . ��� $ circle��	 � ��
 �	#FF3C7FB1�� $ arrow��	 � ��
 �#222P�  � �� . . ��� $ circle��	 � ��
 �	#FF526C7B�� $ circle��	 � ��$	
 1.5���� $ arrow��	 � ��
 �	#FF003366�� " d�.��� 	 � ��
 �� " d�.R��� #< z��._�� 
������  .  # �� $��19 ��� $��* �.+�� U V� ~�X� �� $	V 180Q�.+�A� $W circle��$��Center=�$��19��
�������$��Center=�$��19��F� $ arrow��"����@B `� � �D @KL � z `� 	$��Center=� .  ���#666$��2��$��Center=��� $��1��$
��Left=�$��4,0,0,0q���.  . $��Center=� P�  �@d�	IsChecked$
 trueY�. ��� $ arrow��	 � ��"
 ��@B  �D � �D @B � z  �D 	P�  �@J�IsMouseOver . . ��� $ circle��	 � ��
 �	#FF3C7FB1�� $ arrow��	 � ��
 �#222P�  � �� . . ��� $ circle��	 � ��
 �	#FF526C7B�� $ circle��	 � ��$	
 1.5���� $ arrow��	 � ��
 �	#FF003366�� " d�.��� 	 � ��
 �� " d�.R��� #< z��._�� 
������  .  = �� $��19 ��� $��* �.+�� U V� ~�X� �� $V 90Q�.+�A� $W circle��$��Center=�$��19��
�������$��Center=�$��19��F� $ arrow��"����@B `� � �D @KL � z `� 	$��Center=� .  ���#666$��2��$��Center=��� $��Center=�$��0,4,0,0q�$��1����.  . $	��Top=� P�  �@d�	IsChecked$
 trueY�. ��� $ arrow��	 � ��"
 ��@B  �D � �D @B � z  �D 	P�  �@J�IsMouseOver . . ��� $ circle��	 � ��
 �	#FF3C7FB1�� $ arrow��	 � ��
 �#222P�  � �� . . ��� $ circle��	 � ��
 �	#FF526C7B�� $ circle��	 � ��$	
 1.5���� $ arrow��	 � ��
 �	#FF003366�� .��� 	 � ��
 �� .R��� ._��� $��0q� . 
���   �$��1��$	 1 2R��� " d�.��� 	 � ��
 �� " d�.R��� #< z��._�� 
������  .  # �� $��19 ��� $��* �.+�A� $W circle��$��Center=�$��19��
�������$��Center=�$��19��$��2��F� $ arrow��"����@B `� � �D @KL � z `� 	$��Center=� .  ���	#FF4EFF00$��3��$��Center=��� $��1��$
��Left=�$��4,0,0,0q���.  . $��Center=� P�  �@d�	IsChecked$
 trueY�. ��� $ arrow��	 � ��"
 ��@B  �D � �D @B � z  �D 	P�  �@J�IsMouseOver . . ��� $ circle��	 � ��

 ������� $ arrow��	 � ��
 �	#FFFFBB00P�  � �� . . ��� $ circle��	 � ��
 �	#FF526C7B�� $ circle��	 � ��$	
 1.5���� $ arrow��	 � ��
 �	#FFFFBB00�� " 9�.��� 	 � ��#
 � ���� 	 � ��

 ���� �� 	 � ��$
 Stretch=��� 	 � ��$
 Stretch=��� 	 � ��

 ���� �� 	 � ��$
 1q��� 	 � ��
 �� " 9�.R��� #��z��#��z��#��z��$X 3�� . ._�]� .+�d� $Y 
HeaderSite��#��z��#��z��#��z��$	��Top=�#��z��#��z��8Z   #��z��#��z��#��z��#��z��#��z��$��1q�$��0��$��0��#��z��8�� #��z��8 �� *
IsExpanded+$9 TwoWay=�& �� *TemplatedParent+�� $[ 
ExpandSite��$��Bottom=�|�.  #��z��#��z��$y�	Collapsed=�#��z�� P�  �@9�
IsExpanded . . ��� $ 
ExpandSite��	 � y�$
 Visible=�P�  �@9�ExpandDirection$ Right=�. ��� $ 
ExpandSite��	 � ��$
 Right=��� $ 
HeaderSite��	 � ��$

 Left=��� $ 
HeaderSite��8
  	 � ��P�  �@9�ExpandDirection$ Up=�. ��� $ 
ExpandSite��	 � ��$	
 Top=��� $ 
HeaderSite��	 � ��$
 Bottom=��� $ 
HeaderSite��8
  	 � ��P�  �@9�ExpandDirection$
 Left=�. ��� $ 
ExpandSite��	 � ��$

 Left=��� $ 
HeaderSite��	 � ��$
 Right=��� $ 
HeaderSite��8
  	 � ��P�  � {� .  . ��� #
 � ��	 � ���� " ��.��� 	 � ��
 �� " ��.R�� .+��� $\ con_Refresh_button�����	#FF00A4CE$�� ��
�������#���   ��Z� �� #��z����. # z #��z�� P�  �@J�	IsFocused . P�  �@��IsDefaulted . P�  �@J�IsMouseOver . P�  � �� . P�  � {� .  �� " ��.��� 	 � ��
 �� " ��.R�� .+��� $\ con_Refresh_button�����	#FF00A4CE
�������#���   ��Z� .���� $��16.25��$��refresh.png��$
��Fill=�$��16.25���� #��z����. # z #��z�� P�  �@J�	IsFocused . P�  �@��IsDefaulted . P�  �@J�IsMouseOver . P�  � �� . P�  � {� .  .��� -   $" 
LayoutRoot��.+��� -   $ 	MainPanel�����	#FF313131] � ContextMenu] �� .@�m� -   $��Refresh��^ m� Icon^ �� $��
refres.png���� m� -   $��Author��^ �� $��
author.png���� -   _ ��Name$_ Close_button��$��21��$��	586,3,0,0q�$
��Wrap=�$	��Top=�$
��Left=�$��12��$��18.667(�
�������$��Consolas)��� ` � Language$` en-in�$�X���� -   $_ minimize_button��$��24��$��	0,-1,27,0q�$
��Wrap=�$	��Top=�$��Right=�$��13��$��18.667(�
�������$��Consolas)��� $` en-in�$�_���� -   $_ AppName_Label��$
��Left=�$��33��$��8,5,0,0q�$
��Wrap=�$	��Top=�$	��142��
�������$��21.333(��� $��24(�$��Kristen ITC)�$` en-in�$�</���� $` en-in�$�	 UConnect���� $��24(�$��Kristen ITC)�$` en-in�$� >���� -	   $_ 
ssid_Label��$��22��$��
150,93,0,0q�$
��Wrap=�$	��Top=�
�������$��14.667(�$
��Left=�$	��146���� $` en-in�$�Hotspot Name (SSID) :���� -
   $_ password_key_label��$��126.5,121,0,0q�$
��Wrap=�
�������$��14.667(�$��22��$	��Top=�$
��Left=�$	��173���� $` en-in�$ �Password (>8 characters) :���� -   $6 hotSpot_textBox��$��22��$��304,93,115,0q�a �� TextWrapping$
a Wrap=�$��UConnect_me��$	��Top=�
����������	#FF00A4CE$��14.667(�b �� 
CaretBrush
b �����$��1q���Z� �� -   $6 password_textBox��$��22��$��304,121,115,0q�$
a Wrap=�$	��Top=�
����������	#FF00A4CE$��14.667(�
b �����$��1q���Z� �� -   $\ Control_button��$��
Create New��$��Right=�$��0,157,115,0q�#���   $��82�����	#FF00A4CE
�������$��25��$	��Top=���Z� �� -   $_ available_networks_label��$��114,0,0,125.333q�$
��Wrap=�
�������$��14.667(�$
��Left=�$	��183��$��22��$��Bottom=��� $` en-in�$!�Available Hosted Networks :���� -   c ��Name$ c available_networks_listBox��$��304,0,115,121.333q����	#FF00A4CE
�������$��14.667(�$��27��$��Bottom=���Z� ] �� .@�m� -   $��Start��^ �� $��	start.png��m� -   $
��Stop��^ �� $��stop.png���� m� -   $��Get Password��^ �� $��
getpas.png���� -   $_ num_of_clients_label��$��96,0,0,86.333q�$
��Wrap=�
�������$��14.667(�$
��Left=�$	��202��$��22��$��Bottom=��� $` en-in�$#�Number of Clients Connected :���� -   $_ num_clients_val��$��305,0,231,86.333q�$
��Wrap=�
�������$��14.667(�$��23��$��Bottom=��� $` en-in�$�o���� -   $\ refresh_button��$�� ��$��Right=�$��0,0,115,86.333q�#���  $��82�����	#FF00A4CE
�������$��25��$��Bottom=���Z� 