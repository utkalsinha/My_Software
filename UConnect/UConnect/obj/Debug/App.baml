   M S B A M L   `   `   `  ����a  ]PresentationFramework.Aero, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35gJclr-namespace:Microsoft.Windows.Themes;assembly=PresentationFramework.AeroMicrosoft.Windows.Themes  5   �    UConnect   UConnect.App   6   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     6P   oMicrosoft_Windows_ThemesJclr-namespace:Microsoft.Windows.Themes;assembly=PresentationFramework.Aero     6�   @d2http://schemas.microsoft.com/expression/blend/2008     6�   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     60    �� 	Resources  5         MyComboBoxItemStyle �� 
TargetType �� Property �� Value �� RelativeSource �� AncestorType �� 
TargetType ��Name �� Padding	 J� SnapsToDevicePixels
 �� Triggers P� Property P� Value �� 
TargetName  ComboBoxFocusVisual �� StrokeDashArray  ButtonNormalBackground �� EndPoint �� 
StartPoint � Color � Offset  ButtonNormalBorder �� Color  DownArrowGeometry   ComboBoxReadonlyToggleButton+   %Microsoft.Windows.Themes.ButtonChrome  Name   BorderBrush   
Background J� IsMouseOver   RenderMouseOver   RenderPressed F�Name  TextBoxBorder � MappingMode  ComboBoxEditableTextBox ��Name  ComboBoxToggleButton   RoundCorners 	 ComboBoxEditableTemplate �Name � ColumnDefinitions  �Name! � AllowsTransparency5   /Microsoft.Windows.Themes.SystemDropShadowChrome"  Name#   Color$ �� MaxDropDownHeight% �� ElementName& �� ClearTypeHint' ��Name( ��Name-  'System.Windows.Input.KeyboardNavigation)   DirectionalNavigation,   &Microsoft.Windows.Themes.ListBoxChrome*  Name+   BorderBrush,   BorderThickness-   
Background.   RenderMouseOver/ J� IsKeyboardFocusWithin0   RenderFocused1 ��Name2 �� 
IsReadOnly3 d� 	IsChecked4 �� Mode5 P� 
SourceName 
 MyComboBoxStyle'  !System.Windows.VisualStateManager6   VisualStateGroups%  System.Windows.VisualStateGroup7   Transitions%  System.Windows.VisualTransition8   GeneratedDuration	9   To:   States   System.Windows.VisualState; �� SelectionBoxItemTemplate< �� SelectionBoxItem#= �� SelectionBoxItemStringFormat> �� ContentStringFormat? J� IsHitTestVisible@ �� Triggers��%)$  &	        &	 �    &	 �    &	 ~    &	 �    &	 �    7  &	 �    &	 �    &	 �
    7  &		 �    7  7  &	
     7  7  7  7  7  7 	 �� 5      " ��6&   .�5      ��  � �� 62   �� *HorizontalContentAlignment+ �� " ���� 5       � �� 60   �� *VerticalContentAlignment+ �� " ���� 5	       � ��$ 3,0,3,0q�6   �� 5
       � ��
 ���� 6"   �� 5       � �� 5      �� 5      " ��6   .R�5      �� $ Bd��6   #��z��6   # z��6O   	 . ���	#00833C3C
���   �._�5   	   �� #��z��6   #	 z	 6]   #��z��6�   5   	   
 5      P� 5   	    �@��IsHighlighted . . �5   
   �� $ Bd��6'   # � ��67    � ���� 5   
   # � ��6'    � ��5   
   P� 5   	    � {� .  . �5   
   �� # � ��6'    � ��5   
   5      5      5      �� 5      .�5      ��  � �� 5       �� 5!      .R�5"      �� $��4,4,21,4q�6   	 . #��� ��6?   $��1��6�   $	 1 2R�6�   5#      5%      5&      �� 5'      $	 0,1&�67   $	 0,0&�6F   .��5(      � $ #F3F3F3��6   $ 0Q�6"   � 5)      $ #EBEBEB��6   $	 0.5Q�6"   � 5*      $ #DDDDDD��6   $	 0.5Q�6"   � 5+      $ #CDCDCD��6   $ 1Q�6"   5,      �� 5-      $ 	#FF707070��6/   �5.      M 0 0 L 3.5 4 L 7 0 Z�6>   �� 5/      " d�6/   .�50      ��  �@�OverridesDefaultStyle . 6-   �� 51       � �� .  6!   �� 52       � |� .  6!   �� 53       �@��	ClickMode$ Press=�6!   �� 54       � �� 55      �� 56      " d�6   .R�57        $ Chrome��6.   # z��6>   # z��6j   # z 6�   # z��6�   	 . ._�58   	   � $��Right=�6   #��� r�6*   .+�59   
   F� $ Arrow��6   8��  
���   �$��Center=�6U   $��3,1,0,0q�6r   $��Center=�6�   5:   
   5;   	   
 5<      P� 5=   	    �@d�	IsChecked$
 trueY�6&   . �5>   
   �� $ Chrome��6*    �@ RenderPressed . 6>   5?   
   P� 5@   	    � {� .  . �5A   
   �� $ Arrow��6!    � �� �#AFAFAF64   5B   
   5D      5F      5G      �� 5H      $
 0,20&�6.   $ Absolute=�6>   $	 0,0&�6U   .��5I      � $ #ABADB3��6   $
 0.05Q�6"   � 5J      $ #E2E3EA��6   $
 0.07Q�6"   � 5K      $ #E3E9EF��6   $ 1Q�6"   5L      �� 5M      " ��6*   .�5N      ��  �@�OverridesDefaultStyle . 6-   �� 5O       �@J�	AllowDrop . 6!   �� 5P       � ��$ 0��6    �� 5Q       � ��$ 0��6!   �� 5R       �@�FocusVisualStyle 6(   Z� �� 5S       �@��PanningMode$ VerticalFirst=�60   �� 5T       �@��IsFlicksEnabled .  6.   �� 5U       � �� 5V      �� 5W      " ��6   .R�5X      �� $ PART_ContentHost��6   
������ |�.  $��Hidden=�6Z   $��Hidden=�6�   5Y      5[      5\      �� 5]      " d�6'   .�5^      ��  �@�OverridesDefaultStyle . 6-   �� 5_       � �� .  6!   �� 5`       � |� .  6!   �� 5a       �@��	ClickMode$ Press=�6!   �� 5b       � �� 5c      �� 5d      " d�6   .R�5e        $ Chrome��6.   # z��6>   # z��6j   # z 6�   # z��6�    .  	 . #��� r�6   ._�5f   	   F� $ Arrow��6   8��  
���   �$��Center=�6T   $��0,1,0,0q�6q   $��Center=�6�   5g   	   
 5h      P� 5i   	    �@d�	IsChecked$
 trueY�6&   . �5j   
   �� $ Chrome��6*    �@ RenderPressed . 6>   5k   
   P� 5l   	    � {� .  . �5m   
   �� $ Arrow��6!    � �� �#AFAFAF64   5n   
   5p      5r      5s      �� 5t      " ��65   .R�5u      � $ 	Placement��6
   	 .  5v      �� 5w      $��* �6   �� 5x      $
��Auto �6   .+�5z      � $  
PART_Popup��6   ! . $��2��6:   #��� .�6�   $��Bottom=�6�   ��6N   �� *IsDropDownOpen+ �� *TemplatedParent+.��5{        $
" Shdw��67   $# Transparent��6E   #��z$ 6Y   ��6�   �� *ActualWidth+$% 	Placement��._�5|      �� $ DropDownBorder��6   #��� ��6'   $��1q�6s   #��� ��6�   ._�5}   	   �� $ DropDownScrollViewer��6   .��5~   
   � $& Enabled=�6   .+�5      �� $
��Left=�6   $��0��6-   $	��Top=�68   $��0��6P   .+�5�      �� $' 
OpaqueRect��6   ��6*   �� *
Background+$% DropDownBorder����6b   �� *ActualHeight+$% DropDownBorder����6�   �� *ActualWidth+$% DropDownBorder��5�      �� 5�      $( ItemsPresenter��6   $) 	Contained=�62   #	 z	 6g   5�      5�   
   5�   	   5�      5�        5�      $* Border��6-   #+ z��6=   #, z��6i   #- z��6�   $��2��6�   #. z 6�   #0 z/ 6  �� 5�      $1 PART_EditableTextBox��6   #��z��6,   #��z��6�   8��  #��z��6  2 6v   �� *
IsReadOnly+ �� *TemplatedParent+6  d� 5�      $��1��6   8�� 3 6#   �� *IsDropDownOpen+$4 TwoWay=� �� *TemplatedParent+6�   5�      
 5�      P� 5�       �@J�IsKeyboardFocusWithin . . �5�      ��  � ��
 �   �6$   5�      P� 5�       �@��IsDropDownOpen . . �5�      �� $ Border��6'    �@ RenderFocused . 6;   5�      P� 5�       �@��HasItems .  . �5�      �� $ DropDownBorder��6     � ��$ 95��6<   5�      P� 5�       � {� .  . �5�      �� # � ��6$    � ���� 5�       � �� �	#FFF4F4F46$   5�      P� 5�       �@��
IsGrouping . . �5�      ��  � �� .  67   5�      P� 5�      $5 
PART_Popup��6'    �@�HasDropShadow . . �5�      �� $
 Shdw��6     � ��$ 0,0,5,5q�62   �� 5�      $
 Shdw��6    �@ Color$ 	#71000000��61   5�      P� 5�      $5 DropDownScrollViewer��67    � �� .  . �5�      �� $ 
OpaqueRect��6$    6<   �� *VerticalOffset+$% DropDownScrollViewer�� �@��Top�� 5�      $ 
OpaqueRect��6%    6=   �� *HorizontalOffset+$% DropDownScrollViewer�� �@��Left5�      5�      �� 5�      " ��6"   .�5�      ��  �@�FocusVisualStyle8   6(   �� 5�       � ��# � ��6"   �� 5�       � ��8  6"   �� 5�       � ��8  6#   �� 5�       � ��$ 1q�6'   �� 5�       � ��$
 Auto=�6B   �� 5�       � ��$
 Auto=�6@   �� 5�       � ��$	 4,3q�6   �� 5�       � �� . 65   �� 5�       �@��PanningMode$
 Both=�60   �� 5�       �@��IsFlicksEnabled .  6.   �� 5�       � �� 5�      �� 5�      " ��6   .R�5�      � $ MainGrid��6   	 .  5�   	   �� 5�   
   $��* �6   �� 5�   
   #��� r�6   $��0 �6n   6 5�   	     5�   
   CommonStates��7 5�        5�      $8 0D�6   $9 	MouseOver��63   .: 5�        
Normal��6     5�      	MouseOver��6     5�      Disabled��6   5�        5�   
   FocusStates��.: 5�        	Unfocused��6     5�      Focused��6     5�      FocusedDropDown��6   5�      .+�5�   	   � $  
PART_Popup��6   ! . $��2��6=   $��1q�6�   #��� .�6�   $��Bottom=�6  ��6Q   �� *IsDropDownOpen+ �� *TemplatedParent+.��5�   
     $
" Shdw��6:   $# Transparent��6H   #��z$ 6\   ��6�   �� *ActualWidth+$% MainGrid��._�5�      �� $ DropDownBorder��6   #��� ��6*   $��1q�6v   #��� ��6�   ._�5�      �� $ DropDownScrollViewer��6   .��5�      � $& Enabled=�6   .+�5�      �� $
��Left=�6   $��0��60   $	��Top=�6;   $��0��6S   .+�5�      �� $' 
OpaqueRect��6   ��6-   �� *
Background+$% DropDownBorder����6e   �� *ActualHeight+$% DropDownBorder����6�   �� *ActualWidth+$% DropDownBorder��5�      �� 5�      $( ItemsPresenter��6   $) 	Contained=�65   #	 z	 6j   5�      5�      5�      5�      5�   
   d� 5�   	   #��z��6   #��z��6B   $��2��6l   8�� ���	#FFA338383 6�   �� *IsDropDownOpen+$4 TwoWay=� �� *TemplatedParent+6  �� 5�   	   #��z; 6   #��z��6W   #��z< 6�   #> z= 6�   #��z��6
  ? .  #��z��6f  #	 z	 6�  #��z��6�  5�   	   
 5�      P� 5�   	   $5 
PART_Popup��6*    �@�HasDropShadow . . �5�   
   �� $
 Shdw��6#    � ��$ 0,0,5,5q�65   �� 5�   
   $
 Shdw��6"    �@ Color$ 	#71000000��64   5�   
   P� 5�   	    �@��HasItems .  . �5�   
   �� $ DropDownBorder��6#    � ��$ 95��6?   5�   
   P� 5�   	    � {� .  . �5�   
   �� # � ��6'    � ���� 5�   
    � �� �	#FFF4F4F46'   5�   
   P� 5�   	    �@��
IsGrouping . . �5�   
   ��  � �� .  6:   5�   
   P� 5�   	   $5 DropDownScrollViewer��6:    � �� .  . �5�   
   �� $ 
OpaqueRect��6'    6?   �� *VerticalOffset+$% DropDownScrollViewer�� �@��Top�� 5�   
   $ 
OpaqueRect��6(    6@   �� *HorizontalOffset+$% DropDownScrollViewer�� �@��Left5�   
   5�      5�      @ 5�      P� 5�       �@��
IsEditable . . �5�      ��  � ��8  6%   �� 5�       � ��# � ��6$   �� 5�       � �� .  6#   �� 5�       � ��$ 3q�6!   �� 5�       � ��8  6"   5�      5�      5�      5�      