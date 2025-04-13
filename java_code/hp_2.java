/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/*
 * Renamed from Hp
 */
public class hp_2
implements Serializable {
    private static final long a = -8873042786400661789L;
    @SerializedName(value="account_id")
    private final Long b;
    @SerializedName(value="character_id")
    private final Long c;
    @SerializedName(value="character_name")
    private final String d;
    @SerializedName(value="guild_id")
    private final Long e;
    @SerializedName(value="guild_name")
    private final String f;
    @SerializedName(value="compartment_id")
    private final String g;
    @SerializedName(value="element_id")
    private final Long h;
    @SerializedName(value="element_param_id")
    private final Long i;
    @SerializedName(value="breed_id")
    private final Short j;
    @SerializedName(value="npc_id")
    private final Integer k;
    @SerializedName(value="character_level")
    private final Short l;

    hp_2(Long l, Long l2, String string, Long l3, String string2, String string3, Long l4, Long l5, Short s2, Integer n, Short s3) {
        this.b = l;
        this.c = l2;
        this.d = string;
        this.e = l3;
        this.f = string2;
        this.g = string3;
        this.h = l4;
        this.i = l5;
        this.j = s2;
        this.k = n;
        this.l = s3;
    }

    public static hq_2 a() {
        return new hq_2();
    }

    public hq_2 b() {
        return new hq_2().a(this.b).b(this.c).a(this.d).c(this.e).b(this.f).c(this.g).d(this.h).e(this.i).a(this.j).a(this.k).b(this.l);
    }

    public Long c() {
        return this.b;
    }

    public Long d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public Long f() {
        return this.e;
    }

    public String g() {
        return this.f;
    }

    public String h() {
        return this.g;
    }

    public Long i() {
        return this.h;
    }

    public Long j() {
        return this.i;
    }

    public Short k() {
        return this.j;
    }

    public Integer l() {
        return this.k;
    }

    public Short m() {
        return this.l;
    }

    public String toString() {
        return "TransactionUser(m_accountId=" + this.c() + ", m_characterId=" + this.d() + ", m_characterName=" + this.e() + ", m_guildId=" + this.f() + ", m_guildName=" + this.g() + ", m_accountChestTabId=" + this.h() + ", m_ieId=" + this.i() + ", m_ieParamId=" + this.j() + ", m_breedId=" + this.k() + ", m_npcId=" + this.l() + ", m_characterLevel=" + this.m() + ")";
    }
}

