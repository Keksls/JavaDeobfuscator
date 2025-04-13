/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;

/*
 * Renamed from azN
 */
public class azn_2
extends azk_1 {
    private static final Logger a = Logger.getLogger(azn_2.class);
    private static final short d = 32;

    @Override
    public azk_2 b(String string) {
        try {
            InputStream inputStream = gg_0.c(string);
            azk_2 azk_22 = azn_2.a(inputStream);
            inputStream.close();
            return azk_22;
        }
        catch (IOException iOException) {
            a.error((Object)("IOException during loadImage(" + string + ")"), (Throwable)iOException);
            return null;
        }
    }

    private static azk_2 a(InputStream inputStream) {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        byte[] byArray = azk_2.b(bufferedImage);
        azr_2 azr_22 = new azr_2(bufferedImage.getWidth(), bufferedImage.getHeight(), 32, null, ByteBuffer.wrap(byArray));
        azr_22.a(1);
        azk_2 azk_22 = new azk_2(abc_1.d, azr_22);
        azr_22.u();
        return azk_22;
    }

    @Override
    protected azk_2 a(arf_1 arf_12) {
        try {
            arf_12.a(ByteOrder.BIG_ENDIAN);
            return azn_2.a(new arj_1(arf_12));
        }
        catch (IOException iOException) {
            a.error((Object)"IOException during loadImageFromStream", (Throwable)iOException);
            return null;
        }
    }

    @Override
    protected afe_1 b(arf_1 arf_12) {
        arf_12.a(ByteOrder.BIG_ENDIAN);
        byte[] byArray = new byte[8];
        arf_12.b(byArray);
        if (!azn_2.c(byArray)) {
            return null;
        }
        arf_12.e(8);
        return new afe_1(arf_12.c(), arf_12.c());
    }

    private static boolean c(byte[] byArray) {
        return byArray[0] == -119 && byArray[1] == 80 && byArray[2] == 78 && byArray[3] == 71 && byArray[4] == 13 && byArray[5] == 10 && byArray[6] == 26 && byArray[7] == 10;
    }

    @Override
    protected int a() {
        return 24;
    }
}

