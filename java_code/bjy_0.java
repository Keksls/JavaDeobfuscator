/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Renamed from bjy
 */
public class bjy_0
extends bjg_0 {
    public static final String[] a = new String[0];
    private final String b;
    private final String[] d;
    final int e;
    private Anm f;

    public bjy_0(efh_0 efh_02, String string, int n, String[] stringArray) {
        super(efh_02);
        this.b = string;
        this.e = n;
        this.d = this.a(stringArray);
    }

    private String[] a(String[] stringArray) {
        if (stringArray == null) {
            return a;
        }
        int n = stringArray.length;
        ArrayList<String> arrayList = new ArrayList<String>(n);
        for (int k = 0; k < n; ++k) {
            for (String string : atn_2.a(stringArray[k])) {
                if (arrayList.contains(string)) continue;
                arrayList.add(string);
            }
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    private bjy_0(bjy_0 bjy_02) {
        super(bjy_02.c);
        this.b = bjy_02.b;
        this.e = bjy_02.e;
        this.d = bjy_02.d;
    }

    @Override
    public void a(biI biI2) {
        this.a(biI2, true);
    }

    public void a(abz_0 abz_02, boolean bl) {
        try {
            int n = this.b.indexOf(47);
            String string = n == -1 ? null : this.b.substring(0, n);
            String string2 = n == -1 ? this.b : this.b.substring(n + 1);
            String string3 = biE.a(string, Integer.parseInt(string2));
            if (string3 == null) {
                bjw.a.error((Object)("dossier inconnu ( +" + string + ") pour le chargement de l'anm " + string2 + " [valeurs autoris\u00e9es: equipment/, npc/, player/]"));
                return;
            }
            this.f = abu.c(string3);
            if (bl) {
                if (abz_02 instanceof biI) {
                    ((biI)abz_02).bI().aQ();
                }
            } else {
                abz_02.a(this.f, this.d, null);
            }
        }
        catch (gm_0 gm_02) {
            bjw.a.error((Object)"", (Throwable)gm_02);
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        bjy_0 bjy_02 = (bjy_0)object;
        if (this.b != null ? !this.b.equals(bjy_02.b) : bjy_02.b != null) {
            return false;
        }
        return Arrays.equals(this.d, bjy_02.d);
    }

    @Override
    public int hashCode() {
        int n = super.hashCode();
        n = 31 * n + (this.b != null ? this.b.hashCode() : 0);
        n = 31 * n + (this.d != null ? Arrays.hashCode(this.d) : 0);
        return n;
    }

    public bjy_0 a() {
        return new bjy_0(this);
    }

    public /* synthetic */ bjg_0 c() {
        return this.a();
    }
}

