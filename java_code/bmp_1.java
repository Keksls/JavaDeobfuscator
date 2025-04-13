/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongIntHashMap
 *  gnu.trove.map.hash.TLongLongHashMap
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import gnu.trove.map.hash.TLongIntHashMap;
import gnu.trove.map.hash.TLongLongHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from bmp
 */
public class bmp_1 {
    protected static final Logger a = Logger.getLogger(bmp_1.class);
    private static final bmp_1 b = new bmp_1();
    private final ArrayList<blx_1> c = new ArrayList();
    private byte d = 0;
    private final TLongIntHashMap e = new TLongIntHashMap();
    private final TLongLongHashMap f = new TLongLongHashMap();
    private blx_1 g;
    private blx_1 h;

    public static bmp_1 a() {
        return b;
    }

    public void a(byte by) {
        this.d = by;
        boi_1.b.a(this.d, this.c);
    }

    public void a(ArrayList<byte[]> arrayList, Runnable runnable) {
        euv_2.a.a();
        euw_2.a.b();
        this.e.clear();
        this.f.clear();
        this.c.clear();
        for (int k = 0; k < arrayList.size(); ++k) {
            bnh_1 bnh_12 = this.a(arrayList.get(k));
            this.a(bnh_12);
            euw_2.a.a(azu_0.j().n().u(), bnh_12);
            bnh_12.bv().a(runnable);
        }
        this.j();
        cWI.a().a(true);
    }

    private void a(bnh_1 bnh_12) {
        Optional optional = bhh_1.a(end_0.i);
        if (optional.isEmpty()) {
            return;
        }
        ebo_0 ebo_02 = (ebo_0)optional.get();
        bnh_12.s(ebo_02.b(bnh_12.a_()));
        Optional<Integer> optional2 = ebo_02.c(bnh_12.a_(), ft_1.c).map(fk_2::c);
        if (optional2.isEmpty()) {
            return;
        }
        int n = optional2.get();
        bnh_12.l(n);
        bjw_1 bjw_12 = (bjw_1)eyo_1.g().d(n);
        bnh_12.bv().cg().a(bjw_12);
        if (bnh_12.W_()) {
            return;
        }
        try {
            String string = azs_0.a().a("ANMEquipmentPath");
            Anm anm = abu.c(String.format(string, bjw_12.C()));
            bnh_12.bv().b(anm, biK.a.m);
        }
        catch (gm_0 gm_02) {
            // empty catch block
        }
    }

    private bnh_1 a(byte[] byArray) {
        bmr_1 bmr_12 = new bmr_1(false);
        this.c.add(bmr_12);
        try {
            bmr_12.j(true);
            bmr_12.g(false);
            bmr_12.b(byArray);
        }
        catch (Exception exception) {
            bmr_12.eH().a(bmr_12.eH().d(), byArray);
            a.error((Object)"Erreur durant la d\u00e9Serialization d'un personnage : ", (Throwable)exception);
        }
        return bmr_12;
    }

    public void a(blx_1 blx_12) {
        if (this.b(blx_12)) {
            return;
        }
        this.c.add(blx_12);
    }

    public boolean b(blx_1 blx_12) {
        boolean bl = this.c.contains(blx_12);
        if (bl) {
            return true;
        }
        for (blx_1 blx_13 : this.c) {
            if (blx_13.a_() != blx_12.a_()) continue;
            return true;
        }
        return false;
    }

    public void a(blx_1 blx_12, int n) {
        if (!this.b(blx_12)) {
            throw new IllegalArgumentException("Impossible de rajouter des informations de nation sur un character non-existant : " + blx_12);
        }
        this.e.put(blx_12.a_(), n);
    }

    public int c(blx_1 blx_12) {
        return this.e.get(blx_12.a_());
    }

    public void a(blx_1 blx_12, long l) {
        if (!this.b(blx_12)) {
            throw new IllegalArgumentException("Impossible de rajouter des informations de nation sur un character non-existant : " + blx_12);
        }
        this.f.put(blx_12.a_(), l);
    }

    public long d(blx_1 blx_12) {
        return this.f.get(blx_12.a_());
    }

    public void a(long l) {
        for (int k = this.c.size() - 1; k >= 0; --k) {
            blx_1 blx_12 = this.c.get(k);
            if (blx_12.a_() != l) continue;
            blx_1 blx_13 = this.c.remove(k);
            this.e.remove(blx_13.a_());
            this.f.remove(blx_13.a_());
            this.j();
            if (this.g != null && this.g.a_() == l) {
                int n = k == 0 ? 0 : k - 1;
                this.e(this.c.isEmpty() ? null : this.c.get(n));
            }
            bmf_2.a().e(blx_13);
            return;
        }
    }

    public final void b() {
        this.e(null);
        this.j();
    }

    public final void e(blx_1 blx_12) {
        this.g = this.c.contains(blx_12) ? blx_12 : null;
        fis_1.a().a("characterChoice.selectedCharacter", this.g);
    }

    public final blx_1 c() {
        return this.g;
    }

    public final int d() {
        return this.c.size();
    }

    public final blx_1 e() {
        if (this.h == null) {
            return null;
        }
        for (blx_1 blx_12 : this.c) {
            if (!blx_12.dp().equals(this.h.dp())) continue;
            return blx_12;
        }
        return null;
    }

    public final blx_1 f() {
        if (this.c == null || this.c.size() == 0) {
            return null;
        }
        return this.c.get(0);
    }

    public ArrayList<blx_1> g() {
        return this.c;
    }

    private void j() {
        boi_1.b.a(this.d, this.c);
    }

    public void h() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (blx_1 fileArray : this.c) {
            arrayList.add(fileArray.dp());
        }
        File file = new File(azr_0.a().k());
        if (!file.exists()) {
            return;
        }
        for (File file2 : file.listFiles(new bmq_2(this))) {
            if (arrayList.contains(file2.getName())) continue;
            gi_0.b(file2);
        }
    }

    public void f(blx_1 blx_12) {
        this.h = blx_12;
    }

    public blx_1 b(long l) {
        for (blx_1 blx_12 : this.c) {
            if (blx_12.a_() != l) continue;
            return blx_12;
        }
        return null;
    }

    public blx_1 a(String string) {
        for (blx_1 blx_12 : this.c) {
            if (!blx_12.dp().equals(string)) continue;
            return blx_12;
        }
        return null;
    }

    public void g(blx_1 blx_12) {
        if (this.b(blx_12.a_()) != null) {
            return;
        }
        this.c.add(blx_12);
        this.a(blx_12, blx_12.T_());
        this.a(blx_12, blx_12.bM());
    }

    public short i() {
        if (this.c.isEmpty()) {
            return 0;
        }
        short s2 = 0;
        for (blx_1 blx_12 : this.c) {
            short s3;
            if (blx_12 == null || (s3 = blx_12.dt()) <= s2) continue;
            s2 = s3;
        }
        return s2;
    }
}

