/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.Sets;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bIb
 */
public class bib_0
implements ajh_1 {
    public static final String a = "shardStyle";
    public static final String b = "index";
    public static final String d = "isSlotted";
    public static final String e = "shardLevelText";
    public static final String f = "shardBonusText";
    public static final String g = "shardDoubleBonusText";
    public static final String h = "canRemoveLevel";
    public static final String i = "canAddLevel";
    public static final String j = "addLevelTooltip";
    private static final String[] k = new String[]{"shardStyle", "index", "isSlotted", "shardLevelText", "shardBonusText", "shardDoubleBonusText", "canRemoveLevel", "canAddLevel", "addLevelTooltip"};
    private final byte l;
    private final eze_0 m;
    private final exk_2 n;
    private final Set<exh_2> o;
    private int p;
    private tc_0 q;
    private int r;
    private eZu s;
    private int t;
    private int u;
    private boolean v;

    public bib_0(byte by, eze_0 eze_02, @NotNull exk_2 exk_22) {
        this.l = by;
        this.m = eze_02;
        this.n = exk_22;
        this.o = Sets.newHashSet((Object[])exk_22.U().h());
        this.p = eze_02.a();
        this.q = eze_02.c();
        this.r = eze_02.d();
        this.i();
        this.j();
        this.t = this.u;
    }

    @Override
    public String[] d() {
        return k;
    }

    public byte a() {
        return this.l;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return bib_0.a(this.q, this.p > 0);
        }
        if (string.equals(b)) {
            return this.l;
        }
        if (string.equals(d)) {
            return this.p > 0;
        }
        if (string.equals(e)) {
            if (this.s == null) {
                return "TODO";
            }
            if (this.s.d() == this.u) {
                return bae.h().a("maxLevel", new Object[0]);
            }
            Integer n = this.s.d() == this.u ? null : Integer.valueOf(this.s.a(this.u + 1));
            return bae.h().a("enchantment.shard.level.full", this.u, n);
        }
        if (string.equals(f)) {
            String string2;
            if (this.s == null) {
                return "TODO";
            }
            Optional<ezr_0<?>> optional = this.k();
            if (optional.isEmpty()) {
                return "";
            }
            List<String> list = this.f();
            String string3 = string2 = list.isEmpty() ? "" : list.get(0);
            if (!this.v) {
                return string2;
            }
            return new ani_2().i().a(azf_2.l).a((CharSequence)string2).r();
        }
        if (string.equals(g)) {
            if (this.s == null) {
                return "TODO";
            }
            return bta_1.b(this.s);
        }
        if (string.equals(h)) {
            bpc_2 bpc_22 = azu_0.j().k().eE();
            if (bpc_22 == null || bpc_22.ac_() != 30) {
                return this.t < this.u;
            }
            return true;
        }
        if (string.equals(i)) {
            Optional<ezr_0<?>> optional = this.k();
            if (optional.isEmpty()) {
                return false;
            }
            int n = optional.get().ab().c(this.u);
            return n >= 0 && n <= this.n.c();
        }
        if (string.equals(j)) {
            Optional<ezr_0<?>> optional = this.k();
            if (optional.isEmpty()) {
                return null;
            }
            int n = optional.get().ab().c(this.u);
            if (n < 0) {
                return null;
            }
            return bae.h().a("required.level.custom", n);
        }
        return null;
    }

    public void a(ezb_0 ezb_02) {
        switch (ezb_02.a()) {
            case e: {
                this.r += this.s.a(this.u + 1);
                this.j();
                break;
            }
            case d: {
                this.r -= this.s.a(this.u);
                this.j();
                break;
            }
            case a: 
            case b: {
                this.p = ezb_02.c();
                this.i();
                this.r = this.r <= 0 ? this.s.a(1) : this.r;
                this.j();
                break;
            }
            case c: {
                this.p = 0;
                this.r = 0;
                this.i();
                this.j();
            }
        }
        fis_1.a().a((ajf_1)this, k);
    }

    private void i() {
        if (this.p > 0) {
            this.s = eZv.a.a(this.p);
            if (this.s == null) {
                return;
            }
            this.v = this.s.b().stream().anyMatch(this.o::contains);
        } else {
            this.s = null;
            this.v = false;
        }
    }

    private void j() {
        if (this.s == null) {
            return;
        }
        this.u = this.s.b(this.r);
    }

    public int b() {
        return this.p;
    }

    public int c() {
        return this.r;
    }

    public int e() {
        return this.u;
    }

    List<String> f() {
        Optional<ezr_0<?>> optional = this.k();
        if (optional.isEmpty()) {
            return Collections.emptyList();
        }
        return edf_0.a(optional.get(), this.v, (short)(this.u > 0 ? this.u : 1)).a();
    }

    private Optional<ezr_0<?>> k() {
        return Optional.ofNullable(this.p <= 0 ? null : (Object)eyo_1.g().d(this.p));
    }

    public eze_0 g() {
        return this.m;
    }

    public eZu h() {
        return this.s;
    }

    @Nullable
    public static String a(@Nullable faL faL2, boolean bl) {
        if (faL2 == null) {
            return null;
        }
        switch (faL2) {
            case a: {
                return "shardEmpty";
            }
            case f: {
                return "shardPresent";
            }
            case g: {
                return "shardAny";
            }
        }
        if (faL2.b() != null) {
            return bib_0.a(faL2.b(), bl);
        }
        return null;
    }

    @Nullable
    public static String a(tc_0 tc_02, boolean bl) {
        String string;
        if (tc_02 == null) {
            return null;
        }
        switch (tc_02) {
            case b: {
                string = "shardRed";
                break;
            }
            case c: {
                string = "shardGreen";
                break;
            }
            case d: {
                string = "shardBlue";
                break;
            }
            case e: {
                string = "shardWhite";
                break;
            }
            default: {
                return null;
            }
        }
        String string2 = bl ? "Full" : "Empty";
        return string + string2;
    }
}

