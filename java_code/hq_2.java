/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Hq
 */
public class hq_2 {
    private Long a;
    private Long b;
    private String c;
    private Long d;
    private String e;
    private String f;
    private Long g;
    private Long h;
    private Short i;
    private Integer j;
    private Short k;

    hq_2() {
    }

    public hq_2 a(Long l) {
        this.a = l;
        return this;
    }

    public hq_2 b(Long l) {
        this.b = l;
        return this;
    }

    public hq_2 a(String string) {
        this.c = string;
        return this;
    }

    public hq_2 c(Long l) {
        this.d = l;
        return this;
    }

    public hq_2 b(String string) {
        this.e = string;
        return this;
    }

    public hq_2 c(String string) {
        this.f = string;
        return this;
    }

    public hq_2 d(Long l) {
        this.g = l;
        return this;
    }

    public hq_2 e(Long l) {
        this.h = l;
        return this;
    }

    public hq_2 a(Short s2) {
        this.i = s2;
        return this;
    }

    public hq_2 a(Integer n) {
        this.j = n;
        return this;
    }

    public hq_2 b(Short s2) {
        this.k = s2;
        return this;
    }

    public hp_2 a() {
        return new hp_2(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public String toString() {
        return "TransactionUser.TransactionUserBuilder(accountId=" + this.a + ", characterId=" + this.b + ", characterName=" + this.c + ", guildId=" + this.d + ", guildName=" + this.e + ", accountChestTabId=" + this.f + ", ieId=" + this.g + ", ieParamId=" + this.h + ", breedId=" + this.i + ", npcId=" + this.j + ", characterLevel=" + this.k + ")";
    }
}

