/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bUm
 */
public class bum_0
implements ajh_1 {
    public static final String a = "typeFilterList";
    public static final String[] b = new String[]{"typeFilterList"};
    protected final ArrayList<bun_0> d = new ArrayList();

    public bum_0() {
        this.a();
    }

    protected final void a() {
        this.d.clear();
        for (buq_0 buq_02 : buq_0.values()) {
            if (!this.b(buq_02)) continue;
            this.d.add(this.a(buq_02));
        }
    }

    private boolean b(buq_0 buq_02) {
        return buq_02 != buq_0.a;
    }

    protected bun_0 a(buq_0 buq_02) {
        return new bun_0(buq_02.a());
    }

    @Override
    public String[] d() {
        return b;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.d;
        }
        return null;
    }

    public bun_0 a(byte by) {
        for (bun_0 bun_02 : this.d) {
            if (bun_02.a() != by) continue;
            return bun_02;
        }
        return null;
    }

    public void a(buq_0 buq_02, boolean bl) {
        this.a(buq_02.a(), bl);
    }

    public void a(byte by, boolean bl) {
        this.a(by, bl, true);
    }

    public void a(byte by, boolean bl, boolean bl2) {
        for (bun_0 bun_02 : this.d) {
            if (bun_02.a() != by) continue;
            bun_02.a(bl);
            break;
        }
        if (bl2) {
            ((bvx_0)ans_0.D().h()).a((agp_0)bWe.n, this.g());
        }
    }

    public void b() {
        for (bun_0 bun_02 : this.d) {
            bun_02.a(true);
        }
    }

    public void c() {
        for (bun_0 bun_02 : this.d) {
            bun_02.a(false);
        }
    }

    public void e() {
        this.a(((bvx_0)ans_0.D().h()).f(bWe.n));
    }

    private String g() {
        StringBuilder stringBuilder = new StringBuilder();
        for (bun_0 bun_02 : this.d) {
            if (!bun_02.a(null)) continue;
            stringBuilder.append(bun_02.a()).append(";");
        }
        return stringBuilder.toString();
    }

    public void a(String string) {
        String[] stringArray = this.d.iterator();
        while (stringArray.hasNext()) {
            String[] stringArray2 = stringArray.next();
            stringArray2.a(false);
        }
        for (String string2 : stringArray = string.split(";")) {
            byte by = Co.a((Object)string2, (byte)-1);
            if (by == -1) continue;
            this.a(by, true, false);
        }
    }

    public ArrayList<bun_0> f() {
        return this.d;
    }

    public boolean a(fjg_1 fjg_12, byte by) {
        bun_0 bun_02 = this.a(by);
        if (bun_02 == null) {
            return false;
        }
        return !bun_02.a(fjg_12);
    }
}

