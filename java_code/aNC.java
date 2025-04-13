/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.material.Material;
import org.apache.log4j.Logger;

public class aNC {
    private static final Logger b = Logger.getLogger(aNC.class);
    public static final Material a = (Material)Material.d.c();
    private static final float c = 0.0f;
    private static final float d = 0.1f;

    public static void a(abz_0 abz_02) {
        aNC.a(abz_02, 0.0f);
    }

    public static void b(abz_0 abz_02) {
        aNC.a(abz_02, 0.1f);
    }

    public static void c(abz_0 abz_02) {
        abz_02.ad();
    }

    private static void a(abz_0 abz_02, float f2) {
        float[] fArray = abz_02.am().h();
        a.b(fArray[0] + f2, fArray[1] + f2, fArray[2] + f2);
        abz_02.b(a);
    }

    public static void d(abz_0 abz_02) {
        aNC.b(abz_02, 0.0f);
    }

    private static void b(abz_0 abz_02, float f2) {
        float[] fArray = new float[]{0.1f, 0.1f, 0.1f};
        a.b(fArray[0] + f2, fArray[1] + f2, fArray[2] + f2);
        abz_02.b(a);
    }
}

