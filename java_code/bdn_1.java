/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bdN
 */
public class bdn_1
implements agw_0 {
    protected static final Logger a = Logger.getLogger(bdn_1.class);
    public static final bdn_1 b = new bdn_1();

    private bdn_1() {
    }

    public void a(YK yK) {
        boolean bl = azs_0.a().a("loadGameEvents", true);
        if (!bl) {
            yK.b(this);
            return;
        }
        this.a();
        yK.b(this);
    }

    private boolean a() {
        asw_2.a().a(new aQY(), (T aQY2) -> {
            apc_2 apc_22;
            int n = aQY2.c();
            int n2 = aQY2.d();
            String[] stringArray = aQY2.h();
            String string = aQY2.g();
            short s2 = aQY2.e();
            short s3 = aQY2.f();
            boolean bl = aQY2.i();
            String[] stringArray2 = stringArray != null ? new String[stringArray.length] : new String[]{};
            for (int k = 0; k < stringArray2.length; ++k) {
                stringArray2[k] = stringArray[k] != null && stringArray[k].equals("DEFAULT") ? null : stringArray[k];
            }
            try {
                apc_22 = eyS.c(string);
            }
            catch (Exception exception) {
                apc_22 = null;
                a.error((Object)("Exception during loading Criterion " + string + " from storage"), (Throwable)exception);
            }
            btZ btZ2 = new btZ(n, n2, stringArray2, apc_22, s2, s3, bl);
            bua_0.a.a(btZ2);
            for (aRa aRa2 : aQY2.j()) {
                this.a(btZ2, aRa2);
            }
        });
        bua_0.a.a();
        return true;
    }

    private void a(btZ btZ2, aRa aRa2) {
        apc_2 apc_22;
        int n = aRa2.a();
        short s2 = aRa2.b();
        String string = aRa2.c();
        try {
            apc_22 = eyS.c(string);
        }
        catch (Exception exception) {
            a.error((Object)("Exception during compilation of Criterion " + string), (Throwable)exception);
            apc_22 = null;
        }
        bui_1 bui_12 = new bui_1(n, s2, apc_22);
        btZ2.a(bui_12);
        for (aqz_0 aqz_02 : aRa2.d()) {
            this.a(bui_12, aqz_02);
        }
    }

    private void a(bui_1 bui_12, aqz_0 aqz_02) {
        block8: {
            int n = aqz_02.a();
            int n2 = aqz_02.b();
            bue_0 bue_02 = bum_1.a(n2, n);
            ArrayList<aot_2> arrayList = new ArrayList<aot_2>();
            String[] stringArray = aqz_02.c();
            aqr_2 aqr_22 = bue_02.c_();
            aqq_2 aqq_22 = aqr_22.b(stringArray.length);
            if (aqq_22 != null) {
                boolean bl = true;
                try {
                    for (int k = 0; k < stringArray.length; ++k) {
                        String string = stringArray[k];
                        aqt_2 aqt_22 = (aqt_2)aqq_22.a(k);
                        aot_2 aot_22 = aqt_22.b().a().a(string);
                        arrayList.add(aot_22);
                    }
                }
                catch (Exception exception) {
                    a.error((Object)("Exception during loading parameters of Action with id=" + bue_02.b() + " : "), (Throwable)exception);
                    bl = false;
                }
                try {
                    if (bl) {
                        bue_02.b(arrayList);
                        bui_12.a(bue_02);
                        break block8;
                    }
                    a.error((Object)("Unable to load action with id=" + bue_02.b() + " : failed loading parameters"));
                }
                catch (Exception exception) {
                    a.error((Object)("Exception during parameters application of behavior with id=" + bue_02.b() + " : "), (Throwable)exception);
                }
            } else {
                a.error((Object)("Client action id=" + bue_02.b() + " hasn't correct parameters (undefined template with " + stringArray.length + " parameters)"));
            }
        }
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.scriptAction", new Object[0]);
    }
}

