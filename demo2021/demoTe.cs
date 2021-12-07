
namespace TEST.DEMO.TS
{    
    public partial class se : BaseContent
    {
        public static readonly log4net.ILog log = log4net.LogManager.GetLogger("Logging");

        public CommonParam commonParam;

        private DataTable dtMain;

        private DataTable hideTable;

        private string lblHubNameContent;

        private RowMergeView demoTbl;

        private Button buttonSave;

        private SortedList<string, bool> realDataSwitchFlag;

        private int tblSecurityWidth = 980;
        private int tblSecurityHight = 505;

        private int buttonSaveWidth = 120;
        private int buttonSaveHight = 40; 
        
        private SortedList<string, string> highValueBackUp = new SortedList<string, string>();
        private SortedList<string, string> middleValueBackUp = new SortedList<string, string>();
        private SortedList<string, string> lowValueBackUp = new SortedList<string, string>();

        private SortedList<string, int> valueIsRealFlagMap = new SortedList<string, int>();

        private string[] lstSecurityLevelComboNames;

        private string[] lstActionModeComboNames;

        private string[] nonDetectionComboNames;

        private string[] defaultComboNames;

        private static IList<string> dataGriditemNameList;

        private static string SecurityLevel = "*********";
        private SortedList<string, string> securityLevelValueMap = new SortedList<string, string>();

        private string[] SetItemName;

        private string[] SetItemAttackModeName;

        private string[] SetItemFloodName;

        private string[] SetItemNetworkScanName;

        private string[] SetItemPortScanName;

        private string[] SetItemProtocolName;

        private string[] SetItemAdvancedName;

        private DataTable FloodData;

        private DataTable NetworkScanData;

        private DataTable PortScanData;

        private DataTable ProtocolAnomaryData;

        private DataTable AdvanceSecurityData;

        private int[] securityDetailRow = new int[] { 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 15, 16
            , 17, 18, 26, 27, 28, 29, 30 };

        private int[] attackModeRow = new int[] { 1, 8, 14, 19, 25};

        private int[] floodRow = new int[] { 2, 3, 4, 5, 6, 7};

        private int[] networkScanRow = new int[] { 9, 10, 11, 12, 13 };

        private int[] portScanRow = new int[] { 15, 16, 17, 18 };

        private int[] protocolRow = new int[] { 20, 21, 22, 23, 24 };

        private int[] advancedRow = new int[] { 26, 27, 28, 29, 30 };

        private int[] limitOrDensityRowHideTable = new int[] { 0, 4, 8, 12, 15, 19, 23, 27, 31, 35, 39
            ,42 ,45 , 48, 51, 54, 56, 59};

        private int[] portRowHideTable = new int[] { 3, 7, 11 };

        private int[] addressclassRowHideTable = new int[] { 22, 26, 30, 34, 38 };

        private int[] requestRowHideTable = new int[] { 63 };

        private int[] mismatchRowHideTable = new int[] { 64 };

        private Button[] Btn;

        private int[] tcpSynRowHideTable = new int[] {0, 1, 2, 3 };

        private int[] tcpAckRowHideTable = new int[] {4, 5, 6, 7 };

        private int[] udpRowHideTable = new int[] {8, 9, 10, 11 };

        private int[] icmpFloodRowHideTable = new int[] {12, 13, 14 };
		
        private int[] arpFloodRowHideTable = new int[] {15, 16, 17 };

        private int[] floodModeRowHideTable = new int[] {18 };

        private int[] arpNetworkRowHideTable = new int[] {19, 20, 21, 22 };

        private int[] tcpNetworkRowHideTable = new int[] {23, 24, 25, 26 };

        private int[] udpNetworkRowHideTable = new int[] {27, 28, 29, 30 };

        private int[] icmpNetworkModeRowHideTable = new int[] {31, 32, 33, 34 };

        private int[] nonEchoIcmpNetworkRowHideTable = new int[] {35, 36, 37, 38 };

        private int[] synPortscanRowHideTable = new int[] {39, 40, 41 };

        private int[] ackPortscanRowHideTable = new int[] {42, 43, 44 };

        private int[] udpPortscanRowHideTable = new int[] {45, 46, 47 };

        private int[] stealthPortscanRowHideTable = new int[] {48, 49, 50 };

        private int[] unknowFloodRowHideTable = new int[] {51, 52, 53 };

        private int[] macFloodRowHideTable = new int[] {54, 55 };

        private int[] smbTraceRowHideTable = new int[] {56, 57, 58 };

        private int[] smbScanRowHideTable = new int[] {59, 60, 61 };

        private int[] arpSpoofingRowHideTable = new int[] {62, 63, 64 };

        private int[] codeConvertRowHideTable = new int[] { 3, 7, 11, 22, 26, 30, 34, 38, 63, 64};

        private SortedList<string, SortedList<int, DataTable>> floodDefaultRangeList 
            = new SortedList<string, SortedList<int, DataTable>>();

        private SortedList<string, SortedList<int, DataTable>> networkScanDefaultRangeList 
            = new SortedList<string, SortedList<int, DataTable>>();

        private SortedList<string, SortedList<int, DataTable>> portScanDefaultRangeList 
            = new SortedList<string, SortedList<int, DataTable>>();

        private SortedList<string, SortedList<int, DataTable>> advancedSecurityDefaultRangeList 
            = new SortedList<string, SortedList<int, DataTable>>();

        private string securityLevelValue;

        private Color changedColor = Color.FromArgb(255, 255, 255, 0);

        private Color editAbleColor = Color.FromArgb(255, 224, 255, 255);

        private DataTable lstSecurityLevelSelectBox;

        private DataTable lstActionModeSelectBox;

        private DataTable PortNumberSelectBox;

        private DataTable ClassSelectBox;

        private DataTable RequestSelectBox;

        private DataTable MismatchSelectBox;

        protected override CreateParams CreateParams
        {
            get
            {
                CreateParams cp = base.CreateParams;
                cp.ExStyle |= 0x02000000;  
                return cp;
            }
        }

        public se()
        {
            InitializeComponent();
            dataChanged = false;
            commonParam = GlobalParam.GetInstance;
            lblHubNameContent = lblHubName.Text;
        }

        private void C003G02Load(object sender, EventArgs e)
        {
            commonParam = GlobalParam.GetInstance;
            InitCodeData();

            if (commonParam.SelectedInfo != null)
            {
                InitData();

                InitReoGrid(); 

            }
            
        }

        private string ToSecurityLevel(string val)
        {
            DataRow[] matches = lstSecurityLevelSelectBox.Select("code_value_name='" + val + "'");
            if (matches.Length > 0)
            {
                return matches[0]["code_value"].ToString();
            }
            return "1";
        }

        private string ToMode(string val)
        {
            DataRow[] matches = lstActionModeSelectBox.Select("code_value_name='" + val + "'");
            if (matches.Length > 0)
            {
                return matches[0]["code_value"].ToString();
            }
            return "0";
        }

        private string ToPort(string val)
        {
            DataRow[] matches = PortNumberSelectBox.Select("code_value_name='" + val + "'");
            if (matches.Length > 0)
            {
                return matches[0]["code_value"].ToString();
            }
            return "0";
        }

        private string ToAddress(string val)
        {
            DataRow[] matches = ClassSelectBox.Select("code_value_name='" + val + "'");
            if (matches.Length > 0)
            {
                return matches[0]["code_value"].ToString();
            }
            return "3";
        }

        private string ToRequest(string val)
        {
            DataRow[] matches = RequestSelectBox.Select("code_value_name='" + val + "'");
            if (matches.Length > 0)
            {
                return matches[0]["code_value"].ToString();
            }
            return "0";
        }

        private string ToMismatch(string val)
        {
            DataRow[] matches = MismatchSelectBox.Select("code_value_name='" + val + "'");
            if (matches.Length > 0)
            {
                return matches[0]["code_value"].ToString();
            }
            return "0";
        }

        private void InitReoGrid()
        {
            demoTbl = CreateDataGridView();
            buttonSave = CreatButtonSave();

            for (int i = 0; i < demoTbl.Columns.Count; i++)
            {
                demoTbl.Columns[i].SortMode = DataGridViewColumnSortMode.NotSortable;
            }

            demoTbl.Columns.Clear();
            demoTbl.DataSource = null;
            demoTbl.Rows.Clear();

            DataGridViewTextBoxColumn column = new DataGridViewTextBoxColumn();
            column.Name = "lblSettingItem";
            column.DataPropertyName = "lblSettingItem";
            column.Width = 460;
            column.MinimumWidth = 460;
            column.ReadOnly = true;
            column.SortMode = DataGridViewColumnSortMode.NotSortable;
            demoTbl.Columns.Add(column);

            foreach (var selectedSwitch in commonParam.SelectedInfo.SelectedSwitchs)
            {
                DataGridViewComboBoxColumn column1 = new DataGridViewComboBoxColumn();
                column1.Name = "ColumnSW" + selectedSwitch.SwitchId;
                column1.DataPropertyName = "ColumnSW" + selectedSwitch.SwitchId;
                column1.HeaderText = selectedSwitch.SwitchName;
                column1.Width = 140;
                demoTbl.Columns.Add(column1);
                foreach (object itemToAdd in defaultComboNames)
                {
                    column1.Items.Add(itemToAdd);
                }
            }

            demoTbl.Columns[0].AutoSizeMode = DataGridViewAutoSizeColumnMode.None;
            demoTbl.Columns[0].Frozen = true;
            demoTbl.ColumnHeadersHeight = 28;
            demoTbl.RowTemplate.Height = 28;

            demoTbl.DataSource = dtMain;

            this.panelContent.Controls.Clear();
            this.panelContent.Controls.Add(demoTbl);
            this.panelContent.Controls.Add(buttonSave);

            dataChanged = false;

            Btn = null;
            Btn = new Button[31];
            demoTbl.Controls.Clear();
            for (int rowIndex = 0; rowIndex < demoTbl.Rows.Count; rowIndex++)
            {
                SecurityUserControl securityUserControl = new SecurityUserControl();
                Button button_securityDetailPopUp = new Button();
                button_securityDetailPopUp = securityUserControl.ButtonSecurityDetailPopUp;

                Btn[rowIndex] = button_securityDetailPopUp;

                Btn[rowIndex].Visible = false;
                if (securityDetailRow.Contains(rowIndex))
                {
                    Btn[rowIndex].Visible = true;
                }
                CellParam cellParam = new CellParam();
                BeanUtil.CopyPropertiesTo(GlobalParam.GetInstance, cellParam);
                cellParam.Col = 0;
                cellParam.Row = rowIndex;
                string lblSettingItem = demoTbl.Rows[rowIndex].Cells["lblSettingItem"].Value.ToString();
                cellParam.LblSettingItem = lblSettingItem.Trim();

                Btn[rowIndex].Click += (sender, e) => SecurityDetailPopUp_Go(cellParam);
                demoTbl.Controls.Add(Btn[rowIndex]);
                Rectangle rectangle = demoTbl.GetCellDisplayRectangle(0, rowIndex, true);
                Btn[rowIndex].SetBounds(rectangle.Left + 460 - 30, 28 * (rowIndex + 1) + 3, 25, 25);
            }

        }

        private Button CreatButtonSave()
        {
            Button button = new Button();
            button.Anchor = ((AnchorStyles)((AnchorStyles.Bottom | AnchorStyles.Right)));
            button.BackColor = Color.LightGray;
            button.ForeColor = Color.Black;
            button.Location = new Point(60 + tblSecurityWidth - buttonSaveWidth, tblSecurityHight + 40);
            button.Margin = new Padding(3, 4, 3, 4);
            button.Name = "buttonSave";
            button.Size = new Size(buttonSaveWidth, buttonSaveHight);
            button.TabIndex = 3;
            button.Text = "保存";
            button.UseVisualStyleBackColor = false;
            button.Click += new EventHandler(ButtonSaveClick);

            return button;

        }

        private RowMergeView CreateDataGridView()
        {
            RowMergeView demoTbl = new RowMergeView();

            demoTbl.Location = new Point(60, 10);
            demoTbl.Size = new Size(tblSecurityWidth, tblSecurityHight);
            demoTbl.AllowUserToAddRows = false;
            demoTbl.AllowUserToDeleteRows = false;
            demoTbl.AllowUserToResizeRows = false;
            demoTbl.Anchor = ((AnchorStyles)((((AnchorStyles.Top 
            | AnchorStyles.Bottom)
            | AnchorStyles.Left)
            | AnchorStyles.Right)));
            DataGridViewCellStyle tblSecurityCellStyle = new DataGridViewCellStyle();
            tblSecurityCellStyle.Alignment = DataGridViewContentAlignment.MiddleCenter;
            tblSecurityCellStyle.BackColor = Color.Navy;
            tblSecurityCellStyle.Font = new Font("Meiryo UI", 16F, FontStyle.Regular, GraphicsUnit.Pixel);
            tblSecurityCellStyle.ForeColor = SystemColors.Window;
            tblSecurityCellStyle.SelectionBackColor = SystemColors.Highlight;
            tblSecurityCellStyle.SelectionForeColor = SystemColors.HighlightText;
            tblSecurityCellStyle.WrapMode = DataGridViewTriState.False;
            demoTbl.ColumnHeadersDefaultCellStyle = tblSecurityCellStyle;

            DataGridViewCellStyle tblSecurityCellStyle2 = new DataGridViewCellStyle();
            tblSecurityCellStyle2.Alignment = System.Windows.Forms.DataGridViewContentAlignment.MiddleLeft;
            tblSecurityCellStyle2.BackColor = System.Drawing.SystemColors.Window;
            tblSecurityCellStyle2.Font = new System.Drawing.Font("Meiryo UI", 16F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Pixel);
            tblSecurityCellStyle2.ForeColor = System.Drawing.SystemColors.ControlText;
            tblSecurityCellStyle2.SelectionBackColor = System.Drawing.Color.Transparent;
            tblSecurityCellStyle2.SelectionForeColor = System.Drawing.SystemColors.ControlText;
            tblSecurityCellStyle2.WrapMode = System.Windows.Forms.DataGridViewTriState.False;
            demoTbl.DefaultCellStyle = tblSecurityCellStyle2;

            demoTbl.ColumnHeadersHeightSizeMode = DataGridViewColumnHeadersHeightSizeMode.DisableResizing;
            demoTbl.EditMode = DataGridViewEditMode.EditOnKeystroke;
            demoTbl.EnableHeadersVisualStyles = false;
            demoTbl.Margin = new Padding(3, 4, 3, 4);
            demoTbl.MergeColumnHeaderBackColor = SystemColors.Control;
            demoTbl.Name = "demoTbl";
            demoTbl.RowHeadersVisible = false;
            demoTbl.RowHeadersWidth = 51;
            demoTbl.RowTemplate.Height = 23;
            demoTbl.TabIndex = 2;

            demoTbl.CellPainting += new DataGridViewCellPaintingEventHandler(TblSecurityCellPainting);
            demoTbl.CellValueChanged += new DataGridViewCellEventHandler(TblSecurityCellValueChanged);
            demoTbl.EditingControlShowing += new DataGridViewEditingControlShowingEventHandler(TblSecurityEditingControlShowing);
            demoTbl.Scroll += new ScrollEventHandler(TblMainScroll);
            demoTbl.SelectionChanged += new EventHandler(TblSelectionChange);
            demoTbl.AllowUserToAddRows = false;

            return demoTbl;

        }
        private void TblSelectionChange(object sender, EventArgs e)
        {
            DataGridView dgv = sender as DataGridView;
            dgv.ClearSelection();
        }

        private void InitData()
        {
            floodDefaultRangeList.Clear();
            networkScanDefaultRangeList.Clear();
            portScanDefaultRangeList.Clear();
            advancedSecurityDefaultRangeList.Clear();

            dtMain = new DataTable();
            dtMain = GridTableView();
            hideTable = new DataTable();
            hideTable = SetHideTable();

            if (commonParam.SelectedInfo.SelectedSwitchs.Count == 0)
            {
                return;
            }
            lblHubName.Text = lblHubNameContent + commonParam.SelectedInfo.BaseName;

            var switchs = "";
            foreach (var selectedSwitch in commonParam.SelectedInfo.SelectedSwitchs)
            {
                switchs += string.Format("'{0}',", selectedSwitch.SwitchId);
            }

            switchs = switchs.TrimEnd(',');

            highValueBackUp.Clear();
            middleValueBackUp.Clear();
            lowValueBackUp.Clear();

            valueIsRealFlagMap.Clear();
            securityLevelValueMap.Clear();

            realDataSwitchFlag = new SortedList<string, bool>();
            using (var dbHelp = new DbHelp())
            {

            }

        }

        private void SetGridHideDefaultValue(DbHelp dbHelp, string lblSettingItem, int rowIndex
            ,string currentSwitchId, DataRow rowMain, string switchId)
        {
            if (limitOrDensityRowHideTable.Contains(rowIndex))
            {
                securityLevelValue = securityLevelValueMap[switchId];


                string lblSettingItemDefualt = null;

                if (rowIndex == smbTraceRowHideTable[0] || rowIndex == smbScanRowHideTable[0])
                {
                }
                else
                {
                    lblSettingItemDefualt = lblSettingItem;
                }


                if (highFlg)
                {
                    rowMain[currentSwitchId] = hignValue;
                } 
                else if (middleFlg)
                {
                    rowMain[currentSwitchId] = middleValue;
                } 
                else if (LowFlg)
                {
                    rowMain[currentSwitchId] = lowValue;
                } 

            }
            else if (portRowHideTable.Contains(rowIndex))
            {
                var value = GetC003G02_02_port(dbHelp, switchId, lblSettingItem).Rows[0][0].ToString();
                rowMain[currentSwitchId] = value;
            }
            else if (addressclassRowHideTable.Contains(rowIndex))
            {
                var value = GetC003G02_02_addressClass(dbHelp, switchId, lblSettingItem).Rows[0][0].ToString();
                rowMain[currentSwitchId] = value;
            }
            else if (requestRowHideTable.Contains(rowIndex))
            {
                var value = GetC003G02_02_ArpSpoofing_request(dbHelp, switchId, lblSettingItem).Rows[0][0].ToString();
                rowMain[currentSwitchId] = value;
            }
            else if (mismatchRowHideTable.Contains(rowIndex))
            {
                var value = GetC003G02_02_ArpSpoofing_mismatch(dbHelp, switchId, lblSettingItem).Rows[0][0].ToString();
                rowMain[currentSwitchId] = value;
            }
        }


        private void GetSettingRange(DbHelp dbHelp, string switchs, string lblSettingItem)
        {
            if (SetItemFloodName.Contains(lblSettingItem))
            {
                SortedList<int, DataTable> floodDefaultRange = GetFloodDefaultRange(dbHelp, switchs, lblSettingItem);
                floodDefaultRangeList.Add(lblSettingItem, floodDefaultRange);
            }
            else if (SetItemNetworkScanName.Contains(lblSettingItem)) 
            {
                SortedList<int, DataTable> networkScanDefaultRange  = GetNetworkScanDefaultRange(dbHelp, switchs, lblSettingItem);
                networkScanDefaultRangeList.Add(lblSettingItem, networkScanDefaultRange);
            }
            else if (SetItemPortScanName.Contains(lblSettingItem)) 
            {
                SortedList<int, DataTable> portScanDefaultRange  = GetPortScanDefaultRange(dbHelp, switchs, lblSettingItem);
                portScanDefaultRangeList.Add(lblSettingItem, portScanDefaultRange);
            }
            else if (SetItemAdvancedName.Contains(lblSettingItem)) 
            {
                SortedList<int, DataTable> advancedSecurityDefaultRange  = GetAdvancedSecurityDefaultRange(dbHelp, switchs, lblSettingItem);
                advancedSecurityDefaultRangeList.Add(lblSettingItem, advancedSecurityDefaultRange);
            }
        }

        private SortedList<int, DataTable> GetAdvancedSecurityDefaultRange(DbHelp dbHelp
            , string switchs, string lblSettingItem)
        {
            SortedList<int, DataTable> dataTableSortedList = new SortedList<int, DataTable>();
            StringBuilder item = new StringBuilder();

            string lblSettingItemInDb = lblSettingItem.ToLower().Replace(" ", "_").Replace("-", "_");
            if (lblSettingItem == SetItemAdvancedName[4])
            {
                item = new StringBuilder();
                item.Append(lblSettingItemInDb).Append("_").Append("timeout").Append("_").Append("min");
                string itemName = item.ToString();
                DataTable rangeOne = GetC003G02_03(dbHelp, switchs, itemName);
                dataTableSortedList.Add(1, rangeOne);

                item = new StringBuilder();
                item.Append(lblSettingItemInDb).Append("_").Append("timeout").Append("_").Append("max");
                itemName = item.ToString();
                DataTable rangeTwo = GetC003G02_03(dbHelp, switchs, itemName);
                dataTableSortedList.Add(2, rangeTwo);

                item = new StringBuilder();
                item.Append(lblSettingItemInDb).Append("_").Append("request").Append("_").Append("min");
                itemName = item.ToString();
                DataTable rangeThree = GetC003G02_03(dbHelp, switchs, itemName);
                dataTableSortedList.Add(3, rangeThree);

                item = new StringBuilder();
                item.Append(lblSettingItemInDb).Append("_").Append("request").Append("_").Append("max");
                itemName = item.ToString();
                DataTable rangeFour = GetC003G02_03(dbHelp, switchs, itemName);
                dataTableSortedList.Add(4, rangeFour);

                item = new StringBuilder();
                item.Append(lblSettingItemInDb).Append("_").Append("mismatch").Append("_").Append("min");
                itemName = item.ToString();
                DataTable rangeFive = GetC003G02_03(dbHelp, switchs, itemName);
                dataTableSortedList.Add(5, rangeFive);

                item = new StringBuilder();
                item.Append(lblSettingItemInDb).Append("_").Append("mismatch").Append("_").Append("max");
                itemName = item.ToString();
                DataTable rangeSix = GetC003G02_03(dbHelp, switchs, itemName);
                dataTableSortedList.Add(6, rangeSix);
            }
            return dataTableSortedList;
        }

        private void TblSecurityCellPainting(object sender, DataGridViewCellPaintingEventArgs e)
        {
            if (e.ColumnIndex >= 1 && e.RowIndex >= 0)
            {
                if (demoTbl.Rows[e.RowIndex].Cells[e.ColumnIndex] 
                    is DataGridViewComboBoxCell)
                {
                    var lblSettingItem = demoTbl.Rows[e.RowIndex].Cells[0].Value.ToString();
                    var cell = demoTbl.Rows[e.RowIndex].Cells[e.ColumnIndex] 
                        as DataGridViewComboBoxCell;

                    if (lblSettingItem == SetItemAttackModeName[4])
                    {
                        cell.Value = "-";
                        cell.ReadOnly = true;

                        var foreColor = Color.Black;

                        e.Handled = false;
                        e.Paint(e.ClipBounds, DataGridViewPaintParts.Background);
                        e.Paint(e.ClipBounds, DataGridViewPaintParts.Border);
                        e.Paint(e.ClipBounds, DataGridViewPaintParts.ContentBackground);
                        e.Paint(e.ClipBounds, DataGridViewPaintParts.SelectionBackground);
                        e.Paint(e.ClipBounds, DataGridViewPaintParts.Focus);

                        using (Brush forebrush = new SolidBrush(foreColor))
                        using (Brush backbrush = new SolidBrush(Color.White))
                        using (StringFormat format = new StringFormat())
                        {
                            Rectangle rect = new Rectangle(e.CellBounds.X + 1, e.CellBounds.Y + 1
                                , e.CellBounds.Width - 19, e.CellBounds.Height - 3);
                            format.LineAlignment = StringAlignment.Center;
                            format.Alignment = StringAlignment.Center;

                            e.Graphics.FillRectangle(backbrush, rect);
                            e.Graphics.DrawString(cell.FormattedValue.ToString(), e.CellStyle.Font
                                , forebrush, rect, format);
                        }

                        e.Paint(e.ClipBounds, DataGridViewPaintParts.ErrorIcon);
                        e.Paint(e.ClipBounds, DataGridViewPaintParts.Focus);
                        e.Handled = true;

                    } 
                    else
                    {
                        var foreColor = cell.FormattedValue.ToString() == "**" ? Color.Red : Color.Black;

                        var cellbackColor = editAbleColor;
                        if ("1".Equals(cell.Tag))
                        {
                            cellbackColor = changedColor;
                        }

                        e.Handled = false;
                        e.Paint(e.ClipBounds, DataGridViewPaintParts.Background);
                        e.Paint(e.ClipBounds, DataGridViewPaintParts.Border);
                        e.Paint(e.ClipBounds, DataGridViewPaintParts.ContentBackground);
                        e.Paint(e.ClipBounds, DataGridViewPaintParts.SelectionBackground);
                        e.Paint(e.ClipBounds, DataGridViewPaintParts.Focus);

                        using (Brush forebrush = new SolidBrush(foreColor))
                        using (Brush backbrush = new SolidBrush(cellbackColor))
                        using (StringFormat format = new StringFormat())
                        {
                            Rectangle rect = new Rectangle(e.CellBounds.X + 1, e.CellBounds.Y + 1
                                , e.CellBounds.Width - 19, e.CellBounds.Height - 3);
                            format.LineAlignment = StringAlignment.Center;
                            format.Alignment = StringAlignment.Center;

                            e.Graphics.FillRectangle(backbrush, rect);
                            e.Graphics.DrawString(cell.FormattedValue.ToString(), e.CellStyle.Font
                                , forebrush, rect, format);
                        }

                        e.Paint(e.ClipBounds, DataGridViewPaintParts.ErrorIcon);
                        e.Paint(e.ClipBounds, DataGridViewPaintParts.Focus);
                        e.Handled = true;
                    }
                }
            }
        }

        private void TblSecurityEditingControlShowing(object sender
            , DataGridViewEditingControlShowingEventArgs e)
        {
            if (demoTbl.CurrentCell.ColumnIndex >= 1)
            {
                int rowIndex = demoTbl.CurrentCell.RowIndex;
                int colIndex = demoTbl.CurrentCell.ColumnIndex;
                var lblSettingItem = demoTbl.Rows[rowIndex].Cells[0].Value.ToString().Trim();

                ComboBox cb = e.Control as ComboBox;
                if (cb != null)
                {

                    cb.Items.Clear();
                    var items = lstActionModeComboNames;
                    if (demoTbl.CurrentCell.RowIndex == 0)
                    {
                        items = lstSecurityLevelComboNames;
                    }
                    else if (lblSettingItem == SetItemAdvancedName[1] || lblSettingItem == SetItemAttackModeName[3]
                        || SetItemProtocolName.Contains(lblSettingItem))
                    {
                        items = nonDetectionComboNames;
                    }

                    foreach (object itemToAdd in items)
                    {
                        cb.Items.Add(itemToAdd);
                    }
                    cb.SelectedItem = demoTbl.CurrentCell.Value;

                    cb.DropDownStyle = ComboBoxStyle.DropDownList;
                }
            }
        }

        private void TblMainScroll(object sender, ScrollEventArgs e)
        {
            if (e.ScrollOrientation == ScrollOrientation.VerticalScroll)
            {

                int curFirstIndex = demoTbl.FirstDisplayedScrollingRowIndex;
                int disCount = demoTbl.DisplayedRowCount(true);
                for (int j = 0; j < Btn.Length; j++)
                {
                    demoTbl.Controls.Remove(Btn[j]);
                }

                for (int i = curFirstIndex; i < curFirstIndex + disCount; i++)
                {
                    Rectangle rect = demoTbl.GetCellDisplayRectangle(0, i, true);

                    Btn[i].Size = new Size(25, 25);
                    Btn[i].Location = new Point(rect.Left + 460 - 30, rect.Top);
                    if (securityDetailRow.Contains(i))
                    {
                        demoTbl.Controls.Add(Btn[i]);
                    }
                    else
                    {
                        demoTbl.Controls.Remove(Btn[i]);
                    }
                }

            }

        }

        private void ButtonSaveClick(object sender, EventArgs e)
        {
            if (Messages.Question(Resources.MSG301) == DialogResult.No)
            {
                return;
            }
            bool realDataFlag = false;
            foreach (var selectedSwitch in commonParam.SelectedInfo.SelectedSwitchs)
            {
                if (!realDataSwitchFlag.Keys.Contains(selectedSwitch.SwitchId))
                {
                    realDataFlag = true;
                }
            }

            if (!realDataFlag && !dataChanged)
            {
                Messages.Warning(Resources.MSG114);
                return;
            }

            DataTable dataTable = dtMain.Copy();

            dataGriditemNameList = new List<string>();
            
            IList<SecurityData> dataList = ConvertToSecurityData(dataTable, dataHideTable);

            using (var dbHelp = new DbHelp())
            {
                NpgsqlTransaction transaction = dbHelp.BeginTransaction();

                transaction.Commit();
            }
        }

        private IList<SecurityData> ConvertToSecurityData(DataTable dataTable, DataTable hideTable)
        {

            IList<SecurityData> ts = new List<SecurityData>();

            Type type = typeof(SecurityData);
            string tempName = "";

            for (int colIndex = 1; colIndex < dataTable.Columns.Count; colIndex++)
            {
                string currentSwitchId = dataTable.Columns[colIndex].ColumnName;
                var switchId = currentSwitchId.Replace("ColumnSW", " ").Trim();
                SecurityData entity = new SecurityData();
                entity.switchId = switchId;
          
                PropertyInfo[] propertys = entity.GetType().GetProperties();
                foreach (PropertyInfo propertyInfo in propertys)
                {
                    tempName = propertyInfo.Name;
                    string hasEXchangeName = LineToHump(tempName);

                    foreach (DataRow dataRow in dataTable.Rows)
                    {
                        int rowIndex = dataTable.Rows.IndexOf(dataRow);
                        string dataGriditemName = dataTable.Rows[rowIndex][0].ToString(); 
                        if (dataGriditemName == hasEXchangeName)
                        {  
                            if (!propertyInfo.CanWrite) continue;

                            object value = dataRow[currentSwitchId];

                            if (value != DBNull.Value)
                                propertyInfo.SetValue(entity, value, null);
                        }
                    }
                    foreach (DataRow dataRow in hideTable.Rows)
                    {
                        int rowIndex = hideTable.Rows.IndexOf(dataRow);
                        string dataGriditemName = hideTable.Rows[rowIndex][0].ToString();

                        if (dataGriditemName == hasEXchangeName)
                        {
                            if (!propertyInfo.CanWrite) continue;

                            object value = dataRow[currentSwitchId];

                            if (codeConvertRowHideTable.Contains(rowIndex))
                            {
                                
                            }
                            else
                            {
                                value = int.Parse(value.ToString());
                            }

                            if (value != DBNull.Value)
                                propertyInfo.SetValue(entity, value, null);
                        }
                    }
                }
                ts.Add(entity);
            }

            return ts;
        }


        private void SaveC003G02_04(DbHelp dbHelp, IList<SecurityData> dataList)
        {
            string program = dbHelp.GetDataTable(@"").Rows[0][0].ToString();

            for (int index = 0; index < dataList.Count; index++)
            {
                SecurityData securityData = dataList[index];

                NpgsqlParameter[] sqlParams = new NpgsqlParameter[1];
                sqlParams[0] = new NpgsqlParameter("@", securityData.switchId);

                string dataExist = dbHelp.GetDataTable(@"SELECT COUNT(1)
                 FROM se
                WHERE switch_id = @switch_id", sqlParams).Rows[0][0].ToString();

                if (dataExist == "0")
                {
                    dbHelp.Execute(insertSql, insertParams);
                }
                else
                {
                    dbHelp.Execute(updateSql, updateParams);
                }
            }
        }

        public string LineToHump(string name)
        {
            string strItemTarget = "";
            for (int j = 0; j < name.Length; j++)
            {
                string temp = name[j].ToString();
                if (Regex.IsMatch(temp, "[A-Z]"))
                {
                    temp = "_" + temp.ToLower();
                }
                strItemTarget += temp;
            }
            return strItemTarget;
        }

        private void TblSecurityCellValueChanged(object sender, DataGridViewCellEventArgs e)
        {
            if (e.ColumnIndex >= 1)
            {
                if (e.RowIndex == 0)
                {

                    string currentSwitchId = demoTbl.Columns[e.ColumnIndex].Name;

                    foreach (DataRow hideRow in hideTable.Rows)
                    {


                    }
                }

                else if (e.RowIndex >= 1)
                {
                    var lblSettingItem = demoTbl.Rows[e.RowIndex].Cells[0].Value.ToString().Trim();
                    var cellValue = demoTbl.Rows[e.RowIndex].Cells[e.ColumnIndex].Value;

                    if (attackModeRow.Contains(e.RowIndex) && !cellValue.Equals("-"))
                    {
                    }
                    else
                    {
                    }
                }
                demoTbl.Rows[e.RowIndex].Cells[e.ColumnIndex].Tag = "1";
                this.dataChanged = true;
            }

        }

    }

}
