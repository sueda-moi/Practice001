using TEST.Common;

namespace TEST.DEMO.C003G02
{
    public class CellParam : CommonParam
    {
        private int col;
        private int row;
        private string lblSettingItem;
        public int Col 
        {
            get { return col; }
            set { col = value; }
        }
        public int Row 
        {
            get { return row; }
            set { row = value; }
        }
        public string LblSettingItem
        {
            get { return lblSettingItem; }
            set { lblSettingItem = value; }
        }
    }
}
