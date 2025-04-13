/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLProfile
 *  com.jogamp.opengl.util.texture.TextureData
 *  com.jogamp.opengl.util.texture.TextureIO
 *  org.apache.log4j.Logger
 */
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.util.texture.TextureData;
import com.jogamp.opengl.util.texture.TextureIO;
import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.color.ColorSpace;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBufferByte;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.MemoryCacheImageOutputStream;
import org.apache.log4j.Logger;

/*
 * Renamed from azm
 */
public class azm_2 {
    protected static final Logger a = Logger.getLogger(azm_2.class);

    public static BufferedImage a(BufferedImage bufferedImage, int n) {
        BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth() + n * 2, bufferedImage.getHeight() + n * 2, 2);
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, n, n, null);
        graphics.dispose();
        return bufferedImage2;
    }

    public static void a(BufferedImage bufferedImage) {
        if (bufferedImage != null) {
            for (int k = 0; k < bufferedImage.getHeight(); ++k) {
                int n = k + bufferedImage.getMinY();
                for (int i2 = 0; i2 < bufferedImage.getWidth(); ++i2) {
                    int n2 = i2 + bufferedImage.getMinX();
                    int n3 = bufferedImage.getRGB(n2, n);
                    float f2 = (float)(n3 >> 24 & 0xFF) / 255.0f;
                    if (f2 == 0.0f) continue;
                    float f3 = (float)(n3 >> 16 & 0xFF) / 255.0f;
                    float f4 = (float)(n3 >> 8 & 0xFF) / 255.0f;
                    float f5 = (float)(n3 & 0xFF) / 255.0f;
                    f3 = f3 / f2 < 1.0f ? f3 / f2 : 1.0f;
                    f4 = f4 / f2 < 1.0f ? f4 / f2 : 1.0f;
                    f5 = f5 / f2 < 1.0f ? f5 / f2 : 1.0f;
                    n3 = (int)(f2 * 255.0f) << 24 | (int)(f3 * 255.0f) << 16 | (int)(f4 * 255.0f) << 8 | (int)(f5 * 255.0f);
                    bufferedImage.setRGB(n2, n, n3);
                }
            }
        }
    }

    public static void b(BufferedImage bufferedImage) {
        if (bufferedImage != null) {
            for (int k = 0; k < bufferedImage.getHeight(); ++k) {
                int n = k + bufferedImage.getMinY();
                for (int i2 = 0; i2 < bufferedImage.getWidth(); ++i2) {
                    int n2 = i2 + bufferedImage.getMinX();
                    int n3 = bufferedImage.getRGB(n2, n);
                    float f2 = (float)(n3 >> 24 & 0xFF) / 255.0f;
                    float f3 = (float)(n3 >> 16 & 0xFF) / 255.0f * f2;
                    float f4 = (float)(n3 >> 8 & 0xFF) / 255.0f * f2;
                    float f5 = (float)(n3 & 0xFF) / 255.0f * f2;
                    bufferedImage.setRGB(n2, n, (int)(f2 * 255.0f) << 24 | (int)(f3 * 255.0f) << 16 | (int)(f4 * 255.0f) << 8 | (int)(f5 * 255.0f));
                }
            }
        }
    }

    public static BufferedImage c(BufferedImage bufferedImage) {
        BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), 2);
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, 0, 0, null);
        graphics.dispose();
        return bufferedImage2;
    }

    public static BufferedImage d(BufferedImage bufferedImage) {
        BufferedImage bufferedImage2 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), 3);
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, 0, 0, null);
        graphics.dispose();
        return bufferedImage2;
    }

    public static BufferedImage a(InputStream inputStream) {
        try {
            TextureData textureData = TextureIO.newTextureData((GLProfile)GLProfile.getDefault(), (InputStream)inputStream, (boolean)false, (String)"tga");
            int n = textureData.getHeight();
            int n2 = textureData.getWidth();
            int n3 = 4 * n2;
            ByteBuffer byteBuffer = ByteBuffer.allocate(n3 * n);
            ByteBuffer byteBuffer2 = (ByteBuffer)textureData.getBuffer();
            byte[] byArray = new byte[n2 * 4];
            int n4 = n3 * n;
            for (int k = 0; k < n; ++k) {
                byteBuffer2.get(byArray);
                byteBuffer.position(n4 -= n3);
                byteBuffer.put(byArray);
            }
            byteBuffer.rewind();
            return azm_2.a(n2, n, byteBuffer.array(), azn_1.b);
        }
        catch (IOException iOException) {
            a.error((Object)"IOException during fromTga", (Throwable)iOException);
            return null;
        }
    }

    public static BufferedImage a(String string) {
        try {
            FileInputStream fileInputStream = new FileInputStream(string);
            return azm_2.a(fileInputStream);
        }
        catch (FileNotFoundException fileNotFoundException) {
            a.error((Object)("FileNotFoundException during fromTga(" + string + ")"), (Throwable)fileNotFoundException);
            return null;
        }
    }

    public static BufferedImage a(BufferedImage bufferedImage, boolean bl) {
        if (bufferedImage == null) {
            return null;
        }
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        BufferedImage bufferedImage2 = new BufferedImage(n, n2, 2);
        bufferedImage2.getGraphics().drawImage(bufferedImage, 0, 0, n, n2, 0, 0, n, n2, null);
        if (bl) {
            AffineTransform affineTransform = AffineTransform.getScaleInstance(1.0, -1.0);
            affineTransform.translate(0.0, -bufferedImage.getHeight(null));
            AffineTransformOp affineTransformOp = new AffineTransformOp(affineTransform, 1);
            bufferedImage2 = affineTransformOp.filter(bufferedImage2, null);
        }
        return bufferedImage2;
    }

    public static afk_2 b(BufferedImage bufferedImage, int n) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = bufferedImage.getWidth();
        int n7 = n5 = bufferedImage.getHeight();
        int n8 = -1;
        int n9 = n6;
        int n10 = -1;
        block0: for (n4 = 0; n4 < n5; ++n4) {
            for (n3 = 0; n3 < n6; ++n3) {
                n2 = (bufferedImage.getRGB(n3, n4) & 0xFF000000) >> 24 & 0xFF;
                if (n2 <= n) continue;
                n8 = n4;
                break block0;
            }
        }
        block2: for (n4 = n5 - 1; n4 >= 0; --n4) {
            for (n3 = 0; n3 < n6; ++n3) {
                n2 = (bufferedImage.getRGB(n3, n4) & 0xFF000000) >> 24 & 0xFF;
                if (n2 <= n) continue;
                n7 = n4;
                break block2;
            }
        }
        block4: for (n4 = 0; n4 < n6; ++n4) {
            for (n3 = 0; n3 < n5; ++n3) {
                n2 = (bufferedImage.getRGB(n4, n3) & 0xFF000000) >> 24 & 0xFF;
                if (n2 <= n) continue;
                n10 = n4;
                break block4;
            }
        }
        block6: for (n4 = n6 - 1; n4 >= 0; --n4) {
            for (n3 = 0; n3 < n5; ++n3) {
                n2 = (bufferedImage.getRGB(n4, n3) & 0xFF000000) >> 24 & 0xFF;
                if (n2 <= n) continue;
                n9 = n4;
                break block6;
            }
        }
        if (n10 == -1 || n8 == -1) {
            return new afk_2(0, 0, 0, 0);
        }
        return new afk_2(n10, n9, n8, n7);
    }

    public static BufferedImage a(int n, int n2, byte[] byArray, azn_1 azn_12) {
        return azm_2.a(n, n2, byArray, azn_12, false);
    }

    public static BufferedImage a(int n, int n2, byte[] byArray, azn_1 azn_12, boolean bl) {
        if (n == 0 || n2 == 0) {
            return null;
        }
        DataBufferByte dataBufferByte = new DataBufferByte(byArray, n * n2);
        int n3 = 4;
        int n4 = 4 * n;
        WritableRaster writableRaster = Raster.createInterleavedRaster(dataBufferByte, n, n2, n4, 4, azn_12.a(), null);
        ColorSpace colorSpace = ColorSpace.getInstance(1000);
        boolean bl2 = true;
        int n5 = 3;
        boolean bl3 = false;
        ComponentColorModel componentColorModel = new ComponentColorModel(colorSpace, true, bl, 3, 0);
        return new BufferedImage(componentColorModel, writableRaster, bl, null);
    }

    public static void a(BufferedImage bufferedImage, OutputStream outputStream, float f2) {
        assert (f2 >= 0.0f && f2 <= 1.0f);
        Iterator<ImageWriter> iterator = ImageIO.getImageWritersByFormatName("jpeg");
        ImageWriter imageWriter = iterator.next();
        ImageWriteParam imageWriteParam = imageWriter.getDefaultWriteParam();
        imageWriteParam.setCompressionMode(2);
        imageWriteParam.setCompressionQuality(f2);
        imageWriter.setOutput(new MemoryCacheImageOutputStream(outputStream));
        imageWriter.write(null, new IIOImage(bufferedImage, null, null), imageWriteParam);
        imageWriter.dispose();
    }

    public static void a(BufferedImage bufferedImage, String string) {
        ComponentColorModel componentColorModel = new ComponentColorModel(ColorSpace.getInstance(1000), new int[]{8, 8, 8, 8}, true, true, 3, 0);
        WritableRaster writableRaster = ((ColorModel)componentColorModel).createCompatibleWritableRaster(bufferedImage.getWidth(), bufferedImage.getHeight());
        BufferedImage bufferedImage2 = new BufferedImage(componentColorModel, writableRaster, bufferedImage.isAlphaPremultiplied(), null);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.setComposite(AlphaComposite.Src);
        graphics2D.drawImage((Image)bufferedImage, 0, 0, null);
        graphics2D.dispose();
        DataBufferByte dataBufferByte = (DataBufferByte)bufferedImage2.getRaster().getDataBuffer();
        ByteBuffer byteBuffer = ByteBuffer.wrap(dataBufferByte.getData());
        azr_2 azr_22 = new azr_2(bufferedImage.getWidth(), bufferedImage.getHeight(), 32, null, byteBuffer);
        azq_1 azq_12 = new azq_1();
        azr_22.a(0);
        azk_2.a(azr_22.h(), azr_22.g());
        azk_2.b(azr_22.h(), azr_22.a() * 4);
        FileOutputStream fileOutputStream = gi_0.o(string);
        gk_0 gk_02 = new gk_0(fileOutputStream);
        azq_12.a(gk_02, new azk_2(abc_1.b, azr_22));
        azr_22.u();
        gk_02.d();
    }
}

