/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from apE
 */
public class ape_1
extends app_1 {
    private final Long e;

    public ape_1(String string) {
        super(string);
        this.b = aon_1.h;
        this.e = Long.parseLong(string);
    }

    public ape_1(String string, Long l) {
        super(string);
        this.b = aon_1.h;
        this.e = l;
    }

    public Long f() {
        return this.e;
    }

    @Override
    public /* synthetic */ Object u_() {
        return this.f();
    }
}

