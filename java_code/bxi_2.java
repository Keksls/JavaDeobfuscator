/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bxI
 */
public class bxi_2
implements ajh_1 {
    private static final Logger h = Logger.getLogger(bxi_2.class);
    public static final String a = "title";
    public static final String b = "description";
    public static final String d = "gifts";
    public static final String e = "iconUrl";
    public static final String f = "guid";
    public static final String[] g = new String[]{"title", "description", "gifts"};
    private String i;
    private String j;
    private final ArrayList<bxe_2> k = new ArrayList();
    private final byte l = 1;

    public void a(uz_1 uz_12) {
        this.i = uz_12.a;
        this.j = uz_12.b;
        ArrayList<va_1> arrayList = uz_12.c;
        for (va_1 va_12 : arrayList) {
            ajh_1 ajh_12;
            uy_1 uy_12 = va_12.a;
            try {
                ajh_12 = bxg_2.a(uy_12);
            }
            catch (bxf_2 bxf_22) {
                h.warn((Object)("Unable to create gift " + uy_12), (Throwable)bxf_22);
                ajh_12 = new bxd_2();
            }
            this.k.add((bxe_2)((Object)ajh_12));
        }
    }

    @Override
    public String[] d() {
        return g;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.i;
        }
        if (string.equals(b)) {
            return this.j;
        }
        if (string.equals(d)) {
            return this.k;
        }
        if (string.equals(e)) {
            return azs_0.a().a("giftTypeIconPath", "defaultIconPath", (byte)1);
        }
        if (string.equals(f)) {
            return this.i;
        }
        return null;
    }

    public boolean a(bxe_2 bxe_22, boolean bl) {
        int n = this.k.indexOf(bxe_22);
        if (n == -1) {
            return false;
        }
        if (bxe_22.a(bl)) {
            this.k.remove(bxe_22);
        }
        if (this.k.size() != 0) {
            fis_1.a().a((ajf_1)this, d);
        }
        return this.k.size() == 0;
    }
}

