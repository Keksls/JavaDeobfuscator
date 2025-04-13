/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from oQ
 */
public abstract class oq_0
implements gs_0 {
    public static oq_0 c(ByteBuffer byteBuffer) {
        oq_0 oq_02;
        byte by = byteBuffer.get();
        switch (by) {
            case 0: {
                oq_02 = new xf_1();
                break;
            }
            case 1: {
                oq_02 = new xd_1();
                break;
            }
            case 2: {
                oq_02 = new xg_2();
                break;
            }
            case 3: {
                oq_02 = new xc_2();
                break;
            }
            case 4: {
                oq_02 = new xj_1();
                break;
            }
            case 5: {
                oq_02 = new xk_1();
                break;
            }
            case 6: {
                oq_02 = new xm_2();
                break;
            }
            case 7: {
                oq_02 = new xl_1();
                break;
            }
            case 8: {
                oq_02 = new xi_1();
                break;
            }
            default: {
                return null;
            }
        }
        if (!oq_02.b(byteBuffer)) {
            return null;
        }
        return oq_02;
    }

    public static oq_0 b(ByteBuffer byteBuffer, int n) {
        oq_0 oq_02;
        byte by = byteBuffer.get();
        switch (by) {
            case 0: {
                oq_02 = new xf_1();
                break;
            }
            case 1: {
                oq_02 = new xd_1();
                break;
            }
            case 2: {
                oq_02 = new xg_2();
                break;
            }
            case 3: {
                oq_02 = new xc_2();
                break;
            }
            case 4: {
                oq_02 = new xj_1();
                break;
            }
            case 5: {
                oq_02 = new xk_1();
                break;
            }
            case 6: {
                oq_02 = new xm_2();
                break;
            }
            case 7: {
                oq_02 = new xl_1();
                break;
            }
            case 8: {
                oq_02 = new xi_1();
                break;
            }
            default: {
                return null;
            }
        }
        if (!oq_02.a(byteBuffer, n)) {
            return null;
        }
        return oq_02;
    }

    public abstract byte a();

    public abstract void a(StringBuilder var1, String var2);
}

