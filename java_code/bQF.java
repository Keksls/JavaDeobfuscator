/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.Objects;

public class bQF
implements ajh_1 {
    public static final String a = "id";
    public static final String b = "description";
    public static final String d = "rarity";
    public static final String e = "rarityText";
    public static final String f = "rarityColor";
    public static final String g = "rarityBackgroundColor";
    public static final String h = "isNew";
    public static final String[] i = new String[]{"id", "description", "rarity", "rarityText", "rarityColor", "rarityBackgroundColor", "isNew"};
    public static final Comparator<bQF> j = (bQF2, bQF3) -> {
        fjl_0 fjl_02 = bQF2.f();
        fjl_0 fjl_03 = bQF3.f();
        if (fjl_02 == null) {
            return -1;
        }
        if (fjl_03 == null) {
            return 1;
        }
        int n = fjl_0.g().compare(fjl_02, fjl_03);
        if (n != 0) {
            return n;
        }
        return CharSequence.compare(bQF2.e(), bQF3.e());
    };
    public static final Comparator<bQF> k = (bQF2, bQF3) -> {
        fjl_0 fjl_02 = bQF2.f();
        fjl_0 fjl_03 = bQF3.f();
        if (fjl_02 == null) {
            return -1;
        }
        if (fjl_03 == null) {
            return 1;
        }
        int n = CharSequence.compare(bQF2.e(), bQF3.e());
        if (n != 0) {
            return n;
        }
        return fjl_0.g().compare(fjl_02, fjl_03);
    };
    private final short l;
    private boolean m;

    public bQF(short s2, boolean bl) {
        this.l = s2;
        this.m = bl;
    }

    public short a() {
        return this.l;
    }

    public boolean b() {
        return this.m;
    }

    public void a(boolean bl) {
        this.m = bl;
        fis_1.a().a((ajf_1)this, h);
    }

    private String g() {
        String string = this.e();
        if (string == null) {
            return bae.h().a("player.title.no.title", new Object[0]);
        }
        return string;
    }

    public boolean c() {
        return this.l != 0 && cbp_1.a.a(this.l) != null;
    }

    public String e() {
        if (!this.c()) {
            return null;
        }
        return bae.h().a(34, (long)this.l, new Object[0]);
    }

    public String a(byte by) {
        byte by2 = Cr.a();
        Cr.a(by);
        String string = this.e();
        Cr.a(by2);
        return string;
    }

    public fjl_0 f() {
        if (!this.c()) {
            return null;
        }
        return cbp_1.a.a(this.l).b();
    }

    private String h() {
        fjl_0 fjl_02 = this.f();
        if (fjl_02 == null) {
            return null;
        }
        return bae.h().a("title.rarity.", fjl_02.a());
    }

    private azj_2 i() {
        fjl_0 fjl_02 = this.f();
        if (fjl_02 == null) {
            return null;
        }
        return fjl_02.b();
    }

    private azj_2 j() {
        fjl_0 fjl_02 = this.f();
        if (fjl_02 == null) {
            return null;
        }
        return new azf_2(fjl_02.b(), 0.5f);
    }

    @Override
    public String[] d() {
        return i;
    }

    @Override
    public Object b(String string) {
        switch (string) {
            case "id": {
                return this.a();
            }
            case "description": {
                return this.g();
            }
            case "rarity": {
                return this.f();
            }
            case "rarityText": {
                return this.h();
            }
            case "rarityColor": {
                return this.i();
            }
            case "rarityBackgroundColor": {
                return this.j();
            }
            case "isNew": {
                return this.b();
            }
        }
        return null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bQF bQF2 = (bQF)object;
        return this.l == bQF2.l;
    }

    public int hashCode() {
        return Objects.hash(this.l);
    }
}

