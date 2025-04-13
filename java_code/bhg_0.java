/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bHG
 */
public class bhg_0
extends exq_1<bhg_0> {
    public bhg_0(short s2, short s3, exh_2[] exh_2Array) {
        super(s2, s3, exh_2Array);
    }

    public String a() {
        return this.a(false);
    }

    public String a(boolean bl) {
        if (!bae.h().a(14, (long)this.d())) {
            return "";
        }
        return bae.h().a(14, (long)this.d(), bl ? 1 : 0);
    }

    @Override
    public boolean b() {
        return super.b();
    }

    @Override
    public abc_2<bhg_0> c() {
        return super.c();
    }

    public String toString() {
        return "ItemType{" + this.d() + "=" + this.a() + "}";
    }
}

