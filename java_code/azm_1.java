/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLProfile
 *  com.jogamp.opengl.util.texture.TextureData
 *  com.jogamp.opengl.util.texture.awt.AWTTextureIO
 *  org.apache.log4j.Logger
 */
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.texture.TextureData;
import com.jogamp.opengl.util.texture.awt.AWTTextureIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.imageio.ImageIO;
import org.apache.log4j.Logger;

/*
 * Renamed from azM
 */
public class azm_1
extends azk_1 {
    private static final Logger a = Logger.getLogger(azm_1.class);

    @Override
    public azk_2 b(String string) {
        BufferedImage bufferedImage = null;
        try {
            InputStream inputStream = gg_0.c(string);
            bufferedImage = ImageIO.read(inputStream);
            inputStream.close();
        }
        catch (IOException iOException) {
            a.error((Object)("Exception during loadImage(" + string + ")"), (Throwable)iOException);
        }
        if (bufferedImage == null) {
            return null;
        }
        return azk_2.a(bufferedImage);
    }

    private static azk_2 a(InputStream inputStream) {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        TextureData textureData = AWTTextureIO.newTextureData((GLProfile)GLProfile.getDefault(), (BufferedImage)bufferedImage, (int)6407, (int)6407, (boolean)false);
        Buffer buffer = textureData.getBuffer();
        azr_2 azr_22 = new azr_2(textureData.getWidth(), textureData.getHeight(), 24, null, (ByteBuffer)buffer);
        azr_22.a((byte)1);
        azk_2.a(azr_22.h(), azr_22.g());
        azk_2 azk_22 = new azk_2(abc_1.f, azr_22);
        azr_22.u();
        return azk_22;
    }

    @Override
    protected azk_2 a(arf_1 arf_12) {
        try {
            arf_12.a(ByteOrder.BIG_ENDIAN);
            return azm_1.a(new arj_1(arf_12));
        }
        catch (IOException iOException) {
            a.error((Object)"IOException during loadImageFromStream", (Throwable)iOException);
            return null;
        }
    }

    @Override
    protected afe_1 b(arf_1 arf_12) {
        arf_12.a(ByteOrder.BIG_ENDIAN);
        byte by = arf_12.a();
        byte by2 = arf_12.a();
        if (by != -1 || by2 != -40) {
            return new afe_1(0, 0);
        }
        while (true) {
            short s2;
            int n = 0;
            byte by3 = arf_12.a();
            while (by3 != -1) {
                ++n;
                by3 = arf_12.a();
            }
            while ((by3 = arf_12.a()) == -1) {
            }
            if (n != 0) {
                return new afe_1(0, 0);
            }
            switch (by3) {
                case -64: 
                case -63: 
                case -62: 
                case -61: 
                case -59: 
                case -58: 
                case -57: 
                case -55: 
                case -54: 
                case -53: 
                case -51: 
                case -50: 
                case -49: {
                    arf_12.e(3);
                    s2 = arf_12.b();
                    short s3 = arf_12.b();
                    return new afe_1(s3, s2);
                }
                case -39: 
                case -38: {
                    return new afe_1(0, 0);
                }
            }
            s2 = arf_12.b();
            if (s2 < 2) {
                return new afe_1(0, 0);
            }
            arf_12.e(s2 - 2);
        }
    }

    @Override
    protected int a() {
        return Integer.MAX_VALUE;
    }
}

