/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aMh
 */
public class amh_1
implements amf_1 {
    private static final Logger a = Logger.getLogger(amh_1.class);
    private arg_1 b;
    private final String[] c;

    public amh_1(String ... stringArray) {
        this.c = stringArray;
    }

    public void a(arg_1 arg_12) {
        this.b = arg_12;
    }

    @Override
    public amx_1 a(long l) {
        if (this.b == null) {
            a.error((Object)"PakFile non d\u00e9finie !");
            return null;
        }
        String string = this.b.a() + "!/";
        int n = this.c.length;
        for (int k = 0; k < n; ++k) {
            String string2 = l + "." + this.c[k];
            gj_0.a(string + string2);
            if (!this.b.b(string2)) continue;
            return new ame_2(this.b, string2, string + string2);
        }
        return null;
    }
}

