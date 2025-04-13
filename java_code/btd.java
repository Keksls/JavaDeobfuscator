/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class btd
extends btb {
    public static final String P = "mysteryBoxBronze";
    public static final String Q = "mysteryBoxSilver";
    public static final String R = "mysteryBoxGold";
    public static final String S = "mysteryBoxBronzeQuantity";
    public static final String T = "mysteryBoxSilverQuantity";
    public static final String U = "mysteryBoxGoldQuantity";
    private final bao_2 V;

    public btd(int n, @NotNull bao_2 bao_22) {
        super(n);
        this.V = bao_22;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(P)) {
            return this.a(199);
        }
        if (string.equals(Q)) {
            return this.a(59);
        }
        if (string.equals(R)) {
            return this.a(0);
        }
        if (string.equals(S)) {
            return "x" + this.b(199);
        }
        if (string.equals(T)) {
            return "x" + this.b(59);
        }
        if (string.equals(U)) {
            return "x" + this.b(0);
        }
        return super.b(string);
    }

    @Override
    protected int h() {
        return 2;
    }

    @Override
    public short o() {
        return (short)this.V.d();
    }

    @Override
    public boolean l() {
        return true;
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    public boolean t() {
        return false;
    }

    @Override
    public long p() {
        return this.V.b();
    }

    @Override
    protected String r() {
        return bae.h().a(77, this.V.e(), new Object[0]);
    }

    @Override
    public String n() {
        return bae.h().a(89, (long)this.V.c(), new Object[0]);
    }

    @Override
    protected String g() {
        return null;
    }

    @Override
    protected String f() {
        return null;
    }

    @Override
    protected String e() {
        return "DungeonLadderNoCrown";
    }

    @Override
    public bht_1 a(int n) {
        Optional<Integer> optional = eub_1.b(this.V.a(), n);
        if (optional.isEmpty()) {
            return null;
        }
        Object r2 = eyo_1.g().d(optional.get());
        return new bht_1((ezr_0<bhg_0>)r2);
    }

    @Override
    public int a(btm btm2) {
        return this.b(btm2.f());
    }

    @Override
    public int b(int n) {
        return eub_1.a(this.V.a(), n);
    }

    @Override
    @Nullable
    protected String i() {
        return btf.a(this.V.f());
    }

    @Override
    @Nullable
    protected String j() {
        return bae.h().a("dungeon.gameplay." + this.V.f().a(), new Object[0]);
    }

    @Override
    protected ezc_2 k() {
        return this.V.f();
    }

    @Override
    public long q() {
        return this.V.e();
    }

    @Override
    protected boolean a() {
        return false;
    }
}

