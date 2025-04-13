/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public final class aVu
extends aXj {
    private static final Logger d = Logger.getLogger(aVu.class);
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private final int e;
    private final String[] f;

    public aVu(int n, String ... stringArray) {
        this.e = n;
        this.f = (String[])stringArray.clone();
    }

    @Override
    public boolean a() {
        switch (this.e) {
            case 0: {
                return this.f.length == 0;
            }
            case 1: 
            case 2: {
                return this.f.length == 1;
            }
        }
        return false;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9!");
            return;
        }
        try {
            switch (this.e) {
                case 0: {
                    this.e();
                    return;
                }
                case 1: {
                    this.d();
                    return;
                }
                case 2: {
                    this.c();
                    return;
                }
            }
        }
        catch (Exception exception) {
            d.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    private void c() {
        String string = this.f[0];
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)49);
        pt.a(string);
        aaw_22.c(pt);
    }

    private void d() {
        String string = this.f[0];
        aaw_2 aaw_22 = azu_0.j().K();
        Pt pt = new Pt();
        pt.a((byte)3);
        pt.a((short)445);
        pt.a(string);
        aaw_22.c(pt);
    }

    private void e() {
        aVu.a("ai (help | h) : show command help");
        aVu.a("ai on serverId : permit the specified server to manage fights");
        aVu.a("ai off serverId : disable the management of fights for this server");
    }
}

