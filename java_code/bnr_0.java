/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bNr
 */
public class bnr_0
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "enabled";
    public static final String d = "value";
    public static final String e = "style";
    final boolean f;

    public bnr_0(boolean bl) {
        this.f = bl;
    }

    @Override
    public String[] d() {
        return b_;
    }

    public boolean a() {
        return this.f;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.f ? bae.h().a("pvp.ladder.filter.all", new Object[0]) : bae.h().a("pvp.ladder.filter.myGuild", new Object[0]);
        }
        if (string.equals(b)) {
            return this.f || azu_0.j().k().fc() > 0L;
        }
        if (string.equals(d)) {
            return this.f ? 0 : 1;
        }
        if (string.equals(e)) {
            return this.f ? "singleCharacterIcon" : "guild";
        }
        return null;
    }
}

