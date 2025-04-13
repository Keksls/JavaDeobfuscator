/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from boP
 */
public class bop_1 {
    private long a;
    private short b;
    private short c;

    protected bop_1(long l, short s2, short s3) {
        this.a = l;
        this.b = s2;
        this.c = s3;
    }

    public long a() {
        return this.a;
    }

    public void a(long l) {
        this.a = l;
    }

    public short b() {
        return this.b;
    }

    public void a(short s2) {
        this.b = s2;
    }

    public short c() {
        return this.c;
    }

    public void b(short s2) {
        this.c = s2;
    }

    public String a(boolean bl, biP biP2) {
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        bpb_1 bpb_12 = bpc_1.a().a(this.b);
        if (bl) {
            stringBuilder.append("[").append(this.a).append("] ");
        }
        if (biP2 != biP.d) {
            stringBuilder.append(bpb_12.f());
        } else {
            stringBuilder.append(bae.h().a("hooded.monster", new Object[0]));
        }
        switch (biP2) {
            case a: {
                object = new ani_2();
                ((ani_2)object).i();
                ((ani_2)object).a(bmi_0.c.w());
                ((ani_2)object).a((CharSequence)bae.h().a(77, azu_0.j().k().T_(), new Object[0])).j();
                stringBuilder.append("\n").append(((ani_2)object).r());
                break;
            }
            case c: {
                break;
            }
            case d: {
                break;
            }
            case b: {
                stringBuilder.append("\n(").append(bae.h().a("levelShort.custom", this.c)).append(")");
            }
        }
        if (bl && (object = bmf_2.a().c(this.a)) != null && object instanceof bmv_1) {
            bmv_1 bmv_12 = (bmv_1)object;
            for (erl_2 erl_22 : erl_2.values()) {
                if (!bmv_12.a(erl_22)) continue;
                stringBuilder.append("\n");
                stringBuilder.append(erl_22.name());
            }
        }
        return stringBuilder.toString();
    }
}

