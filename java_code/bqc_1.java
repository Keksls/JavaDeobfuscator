/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bQc
 */
public enum bqc_1 {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4);

    private final byte f;

    private bqc_1(int n2) {
        this.f = Hw.b((long)n2);
    }

    public String a() {
        return bae.h().a("guild.storage.type." + this.f, new Object[0]);
    }

    public String b() {
        return azs_0.a().a("guildStorageTypeIconsPath", "defaultIconPath", this.f);
    }

    public String c() {
        return bae.h().a("guild.storage.unlock.shortDescription." + this.f, new Object[0]);
    }

    public String d() {
        return bae.h().a("guild.storage.unlock.longDescription." + this.f, new Object[0]);
    }
}

