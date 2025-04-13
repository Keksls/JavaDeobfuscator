/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.common.nio.Buffers
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.GLProfile
 *  org.apache.log4j.Logger
 */
import com.jogamp.common.nio.Buffers;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLProfile;
import java.nio.IntBuffer;
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from azR
 */
public class azr_1 {
    protected static final Logger a = Logger.getLogger(azr_1.class);
    private static final azr_1 f = new azr_1();
    public static final String b = "Renderer";
    public static final String c = "Vendor";
    public static final String d = "Version";
    public static final String e = "Extensions";

    private azr_1() {
    }

    public static azr_1 a() {
        return f;
    }

    public static void a(GL gL, HashMap<String, String> hashMap) {
        hashMap.put(b, gL.glGetString(7937));
        hashMap.put(c, gL.glGetString(7936));
        hashMap.put(d, gL.glGetString(7938));
        hashMap.put(e, gL.glGetString(7939));
    }

    public static void a(GL gL) {
        a.info((Object)"------- GL dump ---------");
        IntBuffer intBuffer = Buffers.newDirectIntBuffer((int)4);
        intBuffer.rewind();
        boolean bl = gL.glIsEnabled(2929);
        boolean bl2 = gL.glIsEnabled(3089);
        boolean bl3 = gL.glIsEnabled(3008);
        boolean bl4 = gL.glIsEnabled(2960);
        boolean bl5 = gL.glIsEnabled(2884);
        a.info((Object)("GL_PROFILE : " + GLProfile.getDefault().getImplName()));
        a.info((Object)("GL_RENDERER : " + gL.glGetString(7937)));
        a.info((Object)("GL_VENDOR : " + gL.glGetString(7936)));
        a.info((Object)("GL_VERSION : " + gL.glGetString(7938)));
        a.info((Object)("GL_DEPTH_TEST = " + bl));
        a.info((Object)("GL_SCISSOR_TEST = " + bl2));
        a.info((Object)("GL_ALPHA_TEST = " + bl3));
        gL.glGetIntegerv(3415, intBuffer);
        a.info((Object)("GL_STENCIL_TEST = " + bl4 + ";  Stencil depth = " + intBuffer.get(0) + " bits"));
        a.info((Object)("GL_CULL_FACE = " + bl5));
        gL.glGetIntegerv(2978, intBuffer);
        a.info((Object)("GL_VIEWPORT = [" + intBuffer.get(0) + ";" + intBuffer.get(1) + "] - [" + intBuffer.get(2) + ";" + intBuffer.get(3) + "]"));
        gL.glGetIntegerv(3088, intBuffer);
        a.info((Object)("GL_SCISSOR_BOX = [" + intBuffer.get(0) + ";" + intBuffer.get(1) + "] - [" + intBuffer.get(2) + ";" + intBuffer.get(3) + "]"));
        gL.glGetIntegerv(33001, intBuffer);
        a.info((Object)("GL_MAX_ELEMENTS_INDICES = " + intBuffer.get(0)));
        gL.glGetIntegerv(33000, intBuffer);
        a.info((Object)("GL_MAX_ELEMENTS_VERTICES = " + intBuffer.get(0)));
    }

    public static String b() {
        GL2 gL2 = auj_1.a.a().e();
        StringBuilder stringBuilder = new StringBuilder();
        IntBuffer intBuffer = Buffers.newDirectIntBuffer((int)4);
        intBuffer.rewind();
        boolean bl = gL2.glIsEnabled(2929);
        boolean bl2 = gL2.glIsEnabled(3089);
        boolean bl3 = gL2.glIsEnabled(3008);
        boolean bl4 = gL2.glIsEnabled(2960);
        boolean bl5 = gL2.glIsEnabled(2884);
        stringBuilder.append("\tGL_RENDERER : ").append(gL2.glGetString(7937));
        stringBuilder.append("\n\tGL_VENDOR : ").append(gL2.glGetString(7936));
        stringBuilder.append("\n\tGL_VERSION : ").append(gL2.glGetString(7938));
        stringBuilder.append("\n\tGL_DEPTH_TEST = ").append(bl);
        stringBuilder.append("\n\tGL_SCISSOR_TEST = ").append(bl2);
        stringBuilder.append("\n\tGL_ALPHA_TEST = ").append(bl3);
        gL2.glGetIntegerv(3415, intBuffer);
        stringBuilder.append("\n\tGL_STENCIL_TEST = ").append(bl4).append("  ").append(intBuffer.get(0)).append("bits");
        stringBuilder.append("\n\tGL_CULL_FACE = ").append(bl5);
        gL2.glGetIntegerv(2978, intBuffer);
        stringBuilder.append("\n\tGL_VIEWPORT = [").append(intBuffer.get(0)).append(';').append(intBuffer.get(1)).append("] - [").append(intBuffer.get(2)).append(';').append(intBuffer.get(3)).append(']');
        gL2.glGetIntegerv(3088, intBuffer);
        stringBuilder.append("\n\tGL_SCISSOR_BOX = [").append(intBuffer.get(0)).append(';').append(intBuffer.get(1)).append("] - [").append(intBuffer.get(2)).append(';').append(intBuffer.get(3)).append(']');
        return stringBuilder.toString();
    }
}

