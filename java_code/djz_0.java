/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from djZ
 */
class djz_0
extends akk_2 {
    private static final Set<String> a = new HashSet<String>(Arrays.asList("emissaryTutoDialog", "fleaDialog", "verticalFollowedAchievementsDialog", "minimapDialog", "fighterDescriptionDialog"));

    djz_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "loadDialog";
    }

    @Override
    public String b() {
        return "Ouvre une fen?tre de dialogue si elle n'est pas ouverte";
    }

    @Override
    public akf_1[] e() {
        return dir_0.J;
    }

    @Override
    @Nullable
    public final akf_1[] f() {
        return null;
    }

    @Override
    protected void a(int n) {
        String string = this.i(0);
        if (fpm_0.b().q(string)) {
            dir_0.a.info((Object)("dialog " + string + " d\u00e9j\u00e0 ouvert"));
            return;
        }
        Optional<String> optional = a.stream().filter(string::contains).findFirst();
        if (optional.isEmpty()) {
            this.a(dir_0.a, "Ce dialogue n'est pas pris en charge");
            return;
        }
        String string2 = cfi_0.a(optional.get());
        fpm_0.b().a(string, string2, (short)10000);
        if (string.contains("fighterDescriptionDialog")) {
            String string3 = string.substring("fighterDescriptionDialog".length());
            long l = Long.parseLong(string3);
            blx_1 blx_12 = bmf_2.a().c(l);
            fis_1.a().a("fighter", (Object)blx_12, string);
        }
    }
}

