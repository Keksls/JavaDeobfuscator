/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.cg.CGparameter
 *  com.jogamp.opengl.cg.CgGL
 */
import com.jogamp.opengl.cg.CGparameter;
import com.jogamp.opengl.cg.CgGL;

/*
 * Renamed from avr
 */
class avr_2
implements avb_1 {
    final /* synthetic */ avp_2 a;

    avr_2(avp_2 avp_22) {
        this.a = avp_22;
    }

    @Override
    public void a(aut_1 aut_12, int n, float[] fArray) {
        avt_2 avt_22 = this.a.k.g(aut_12.a);
        if (avt_22 == null) {
            avp_2.f.error((Object)("param\u00e8tre inconnu " + aut_12.b));
            return;
        }
        switch (aut_12.c) {
            case a: {
                if (avt_22.a(fArray[n])) break;
                CgGL.cgSetParameter1f((CGparameter)avt_22.a, (float)fArray[n]);
                avt_22.b(fArray[n]);
                break;
            }
            case b: {
                if (avt_22.a(fArray, n, 2)) break;
                CgGL.cgSetParameter2fv((CGparameter)avt_22.a, (float[])fArray, (int)n);
                avt_22.b(fArray, n, 2);
                break;
            }
            case c: {
                if (avt_22.a(fArray, n, 3)) break;
                CgGL.cgSetParameter3fv((CGparameter)avt_22.a, (float[])fArray, (int)n);
                avt_22.b(fArray, n, 3);
                break;
            }
            case d: {
                if (avt_22.a(fArray, n, 4)) break;
                CgGL.cgSetParameter4fv((CGparameter)avt_22.a, (float[])fArray, (int)n);
                avt_22.b(fArray, n, 4);
                break;
            }
            case e: {
                if (avt_22.a(fArray, n, 16)) break;
                CgGL.cgSetParameterValuefr((CGparameter)avt_22.a, (int)16, (float[])fArray, (int)n);
                avt_22.b(fArray, n, 16);
                break;
            }
            default: {
                avp_2.f.error((Object)("type inconnu " + aut_12.c));
            }
        }
    }
}

