   M S B A M L   `   `   `  ���� a  ]PresentationFramework.Aero, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35gJclr-namespace:Microsoft.Windows.Themes;assembly=PresentationFramework.AeroMicrosoft.Windows.Themes   UConnect   UConnect.App   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     oMicrosoft_Windows_ThemesJclr-namespace:Microsoft.Windows.Themes;assembly=PresentationFramework.Aero     @d2http://schemas.microsoft.com/expression/blend/2008     Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006       �� 	Resources     MyComboBoxItemStyle �� 
TargetType �� Property �� Value �� RelativeSource �� AncestorType �� 
TargetType ��Name �� Padding	 J� SnapsToDevicePixels
 �� Triggers P� Property P� Value �� 
TargetName  ComboBoxFocusVisual �� StrokeDashArray  ButtonNormalBackground �� EndPoint �� 
StartPoint � Color � Offset  ButtonNormalBorder �� Color  DownArrowGeometry   ComboBoxReadonlyToggleButton+   %Microsoft.Windows.Themes.ButtonChrome  Name   BorderBrush   
Background J� IsMouseOver   RenderMouseOver   RenderPressed F�Name  TextBoxBorder � MappingMode  ComboBoxEditableTextBox ��Name  ComboBoxToggleButton   RoundCorners 	 ComboBoxEditableTemplate �Name � ColumnDefinitions  �Name! � AllowsTransparency5   /Microsoft.Windows.Themes.SystemDropShadowChrome"  Name#   Color$ �� MaxDropDownHeight% �� ElementName& �� ClearTypeHint' ��Name( ��Name-  'System.Windows.Input.KeyboardNavigation)   DirectionalNavigation,   &Microsoft.Windows.Themes.ListBoxChrome*  Name+   BorderBrush,   BorderThickness-   
Background.   RenderMouseOver/ J� IsKeyboardFocusWithin0   RenderFocused1 ��Name2 �� 
IsReadOnly3 d� 	IsChecked4 �� Mode5 P� 
SourceName 
 MyComboBoxStyle'  !System.Windows.VisualStateManager6   VisualStateGroups%  System.Windows.VisualStateGroup7   Transitions%  System.Windows.VisualTransition8   GeneratedDuration	9   To:   States   System.Windows.VisualState; �� SelectionBoxItemTemplate< �� SelectionBoxItem#= �� SelectionBoxItemStringFormat> �� ContentStringFormat? J� IsHitTestVisible@ �� Triggers��%J  &	        &	 �    &	     &	 �    &	 �    &	 �    7  &	 �    &	 .    &	 �    7  &		 Q    7  7  &	
 �    7  7  7  7  7  7 	 �� " ��.���  � �� �� *HorizontalContentAlignment+ �� " ����  � �� �� *VerticalContentAlignment+ �� " ����  � ��$ 3,0,3,0q���  � ��
 ���� ��  � �� �� " ��.R��� $ Bd��#��z��# z��	 . ���	#00833C3C
���   �._��� #��z��#	 z	 #��z��
 P�  �@��IsHighlighted . . ��� $ Bd��# � �� � ���� # � �� � ��P�  � {� .  . ��� # � �� � ���� .���  � �� �� .R��� $��4,4,21,4q�	 . #��� ��$��1��$	 1 2R��� $	 0,1&�$	 0,0&�.��� $ #F3F3F3��$ 0Q�� $ #EBEBEB��$	 0.5Q�� $ #DDDDDD��$	 0.5Q�� $ #CDCDCD��$ 1Q��� $ 	#FF707070���M 0 0 L 3.5 4 L 7 0 Z��� " d�.���  �@�OverridesDefaultStyle . ��  � �� .  ��  � |� .  ��  �@��	ClickMode$ Press=���  � �� �� " d�.R�  $ Chrome��# z��# z��# z # z��	 . ._�� $��Right=�#��� r�.+�F� $ Arrow��8��  
���   �$��Center=�$��3,1,0,0q�$��Center=�
 P�  �@d�	IsChecked$
 trueY�. ��� $ Chrome�� �@ RenderPressed . P�  � {� .  . ��� $ Arrow�� � �� �#AFAFAF�� $
 0,20&�$ Absolute=�$	 0,0&�.��� $ #ABADB3��$
 0.05Q�� $ #E2E3EA��$
 0.07Q�� $ #E3E9EF��$ 1Q��� " ��.���  �@�OverridesDefaultStyle . ��  �@J�	AllowDrop . ��  � ��$ 0����  � ��$ 0����  �@�FocusVisualStyle Z� ��  �@��PanningMode$ VerticalFirst=���  �@��IsFlicksEnabled .  ��  � �� �� " ��.R��� $ PART_ContentHost��
������ |�.  $��Hidden=�$��Hidden=��� " d�.���  �@�OverridesDefaultStyle . ��  � �� .  ��  � |� .  ��  �@��	ClickMode$ Press=���  � �� �� " d�.R�  $ Chrome��# z��# z��# z # z�� .  	 . #��� r�._�F� $ Arrow��8��  
���   �$��Center=�$��0,1,0,0q�$��Center=�
 P�  �@d�	IsChecked$
 trueY�. ��� $ Chrome�� �@ RenderPressed . P�  � {� .  . ��� $ Arrow�� � �� �#AFAFAF�� " ��.R�� $ 	Placement��	 .  �� $��* ��� $
��Auto �.+�� $  
PART_Popup��! . $��2��#��� .�$��Bottom=����� *IsDropDownOpen+ �� *TemplatedParent+.��  $
" Shdw��$# Transparent��#��z$ ���� *ActualWidth+$% 	Placement��._��� $ DropDownBorder��#��� ��$��1q�#��� ��._��� $ DropDownScrollViewer��.��� $& Enabled=�.+��� $
��Left=�$��0��$	��Top=�$��0��.+��� $' 
OpaqueRect������ *
Background+$% DropDownBorder������ *ActualHeight+$% DropDownBorder������ *ActualWidth+$% DropDownBorder���� $( ItemsPresenter��$) 	Contained=�#	 z	   $* Border��#+ z��#, z��#- z��$��2��#. z #0 z/ �� $1 PART_EditableTextBox��#��z��#��z��8��  #��z��2 �� *
IsReadOnly+ �� *TemplatedParent+d� $��1��8�� 3 �� *IsDropDownOpen+$4 TwoWay=� �� *TemplatedParent+
 P�  �@J�IsKeyboardFocusWithin . . ���  � ��
 �   �P�  �@��IsDropDownOpen . . ��� $ Border�� �@ RenderFocused . P�  �@��HasItems .  . ��� $ DropDownBorder�� � ��$ 95��P�  � {� .  . ��� # � �� � ����  � �� �	#FFF4F4F4P�  �@��
IsGrouping . . ���  � �� .  P� $5 
PART_Popup�� �@�HasDropShadow . . ��� $
 Shdw�� � ��$ 0,0,5,5q��� $
 Shdw�� �@ Color$ 	#71000000��P� $5 DropDownScrollViewer�� � �� .  . ��� $ 
OpaqueRect�� �� *VerticalOffset+$% DropDownScrollViewer�� �@��Top�� $ 
OpaqueRect�� �� *HorizontalOffset+$% DropDownScrollViewer�� �@��Left�� " ��.���  �@�FocusVisualStyle8   ��  � ��# � ����  � ��8  ��  � ��8  ��  � ��$ 1q���  � ��$
 Auto=���  � ��$
 Auto=���  � ��$	 4,3q���  � �� . ��  �@��PanningMode$
 Both=���  �@��IsFlicksEnabled .  ��  � �� �� " ��.R�� $ MainGrid��	 .  �� $��* ��� #��� r�$��0 �6   CommonStates��7   $8 0D�$9 	MouseOver��.:   
Normal��  	MouseOver��  Disabled��  FocusStates��.:   	Unfocused��  Focused��  FocusedDropDown��.+�� $  
PART_Popup��! . $��2��$��1q�#��� .�$��Bottom=����� *IsDropDownOpen+ �� *TemplatedParent+.��  $
" Shdw��$# Transparent��#��z$ ���� *ActualWidth+$% MainGrid��._��� $ DropDownBorder��#��� ��$��1q�#��� ��._��� $ DropDownScrollViewer��.��� $& Enabled=�.+��� $
��Left=�$��0��$	��Top=�$��0��.+��� $' 
OpaqueRect������ *
Background+$% DropDownBorder������ *ActualHeight+$% DropDownBorder������ *ActualWidth+$% DropDownBorder���� $( ItemsPresenter��$) 	Contained=�#	 z	 d� #��z��#��z��$��2��8�� ���	#FFA338383 �� *IsDropDownOpen+$4 TwoWay=� �� *TemplatedParent+�� #��z; #��z��#��z< #> z= #��z��? .  #��z��#	 z	 #��z��
 P� $5 
PART_Popup�� �@�HasDropShadow . . ��� $
 Shdw�� � ��$ 0,0,5,5q��� $
 Shdw�� �@ Color$ 	#71000000��P�  �@��HasItems .  . ��� $ DropDownBorder�� � ��$ 95��P�  � {� .  . ��� # � �� � ����  � �� �	#FFF4F4F4P�  �@��
IsGrouping . . ���  � �� .  P� $5 DropDownScrollViewer�� � �� .  . ��� $ 
OpaqueRect�� �� *VerticalOffset+$% DropDownScrollViewer�� �@��Top�� $ 
OpaqueRect�� �� *HorizontalOffset+$% DropDownScrollViewer�� �@��Left@ P�  �@��
IsEditable . . ���  � ��8  ��  � ��# � ����  � �� .  ��  � ��$ 3q���  � ��8  