

namespace image
{

    public partial class  image: BaseContent
    {
        public image()
        {
            InitializeComponent();
            Image imgResult = null;
            SvgDocument sdoc = SvgDocument.Open(Config.gearImage);

            sdoc.Width = 25;
            sdoc.Height = 25;
            Bitmap bitmap = sdoc.Draw();
            using (System.IO.MemoryStream ms = new System.IO.MemoryStream())
            {
                bitmap.Save(ms, System.Drawing.Imaging.ImageFormat.Png);
                imgResult = Image.FromStream(ms);
            }
            this.ButtonSecurityDetailPopUp.BackgroundImage = imgResult;
        }

    }
}
