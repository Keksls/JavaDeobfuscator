/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Comparator;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cel
 */
public class cel_2
implements ajh_1 {
    public static final String a = "isOnline";
    public static final String b = "onlineWithColor";
    public static final String d = "name";
    public static final String e = "accountId";
    public static final String f = "characterId";
    public static final String g = "nameWithoutText";
    public static final String h = "subscriptionLevel";
    public static final String i = "gameServer";
    public static final String j = "position";
    public static final String k = "instance";
    public static final String l = "ankamaName";
    public static final String m = "level";
    public static final String n = "race";
    public static final String o = "guild";
    public static final String p = "guildId";
    public static final String q = "respawnCoords";
    public static final String r = "respawnGameServer";
    public static final String s = "isMuted";
    public static final String t = "isHiddenMuted";
    public static final String u = "isLanguageRestricted";
    public static final String v = "totalCash";
    public static final String w = "craftsLevelPopup";
    public static final String[] x = new String[]{"isOnline", "onlineWithColor", "name", "accountId", "characterId", "nameWithoutText", "subscriptionLevel", "gameServer", "position", "instance", "ankamaName", "level", "race", "guild", "guildId", "respawnCoords", "respawnGameServer", "isMuted", "isHiddenMuted", "isLanguageRestricted", "totalCash", "craftsLevelPopup"};
    private nU y;
    private String z;

    public cel_2(String string) {
        this.y = nU.aq().a(string).a(0L).b(0L).ar();
    }

    public void a(nU nU2) {
        this.y = nU2;
        fis_1.a().a((ajf_1)this, x);
    }

    public void b(nU nU2) {
        this.y = this.y.ar().b(nU2.T()).f(nU2.V()).c(nU2.Y()).g(nU2.aa()).d(nU2.ad()).ar();
        fis_1.a().a((ajf_1)this, s, t, u);
    }

    public void a(String string) {
        this.z = string;
        fis_1.a().a((ajf_1)this, o);
    }

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "isOnline": {
                return this.y.j();
            }
            case "onlineWithColor": {
                return daX.b(this.y.j());
            }
            case "name": 
            case "nameWithoutText": {
                return this.y.c();
            }
            case "accountId": {
                return String.valueOf(this.y.f());
            }
            case "characterId": {
                return String.valueOf(this.y.h());
            }
            case "ankamaName": {
                return this.y.l() + (String)(this.y.o().isEmpty() ? "" : "#" + this.y.o());
            }
            case "subscriptionLevel": {
                return cel_2.d("moderationPanel.subscriptionLevel", this.h());
            }
            case "race": {
                return cel_2.d("moderationPanel.race", epn_2.a(this.y.r()).toString());
            }
            case "level": {
                return cel_2.d("moderationPanel.level", this.y.t());
            }
            case "guild": {
                return cel_2.d("moderationPanel.guild", this.z);
            }
            case "guildId": {
                return String.valueOf(this.y.v());
            }
            case "position": {
                return cel_2.d("moderationPanel.currentPosition", this.y.x() + ", " + this.y.z() + ", " + this.y.B());
            }
            case "instance": {
                return cel_2.d("moderationPanel.currentInstance", this.y.D());
            }
            case "gameServer": {
                return cel_2.d("moderationPanel.currentGameServer", this.y.F());
            }
            case "respawnCoords": {
                return cel_2.d("moderationPanel.respawnCoords", this.y.I() + ", " + this.y.K() + ", " + this.y.M() + " @ " + this.y.O());
            }
            case "respawnGameServer": {
                return cel_2.d("moderationPanel.currentGameServer", this.y.Q());
            }
            case "isMuted": {
                return this.a(this.y.T(), this.y.V(), "moderationPanel.isMuted");
            }
            case "isHiddenMuted": {
                return this.a(this.y.Y(), this.y.aa(), "moderationPanel.isHiddenMuted");
            }
            case "isLanguageRestricted": {
                if (!this.y.j()) {
                    return cel_2.d("moderationPanel.isLanguageRestricted", "?");
                }
                return cel_2.d("moderationPanel.isLanguageRestricted", bae.h().a(this.y.ad()));
            }
            case "totalCash": {
                return bae.h().a("kama.shortGain", this.y.al() >= 0L ? Long.valueOf(this.y.al()) : "?");
            }
            case "craftsLevelPopup": {
                return this.i();
            }
        }
        return null;
    }

    @Override
    public String[] d() {
        return x;
    }

    private String a(boolean bl, String string, String string2) {
        if (!this.y.j()) {
            return cel_2.d(string2, "?");
        }
        String string3 = bl ? String.format("%s - %s", bae.h().a("yes", new Object[0]), string) : bae.h().a("no", new Object[0]);
        return cel_2.d(string2, string3);
    }

    private static String d(String string, Object object) {
        ani_2 ani_22 = new ani_2();
        ani_22.i().a().a((CharSequence)bae.h().a(string, new Object[0])).b().a((CharSequence)(" : " + object)).j();
        return ani_22.r();
    }

    public long a() {
        return this.y.v();
    }

    public String b() {
        return this.y.c();
    }

    public long c() {
        return this.y.f();
    }

    public long e() {
        return this.y.h();
    }

    public String f() {
        return this.y.l();
    }

    @NotNull
    public String g() {
        return this.y.o();
    }

    private String h() {
        enu_0 enu_02 = enu_0.a(this.y.aj());
        switch (enu_02) {
            case b: {
                return "No booster";
            }
            case c: {
                return "Booster";
            }
        }
        return "?";
    }

    private String i() {
        return this.y.ao().entrySet().stream().map(entry -> new Cm<String, Integer>(brt_1.a((Integer)entry.getKey()), (Integer)entry.getValue())).sorted(Comparator.comparing(cm -> Cz.e((String)cm.a()))).map(cm -> (String)cm.a() + " : " + cm.b()).collect(Collectors.joining("\n"));
    }
}

