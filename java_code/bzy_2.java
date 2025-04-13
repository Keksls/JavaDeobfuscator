/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bzy
 */
public abstract class bzy_2
implements ajh_1 {
    public static final String a = "windowTitle";
    public static final String b = "defaultBuildName";
    public static final String d = "levels";
    public static final String e = "defaultSelectedLevel";
    public static final String f = "iconsList";
    public static final String g = "defaultSelectedIcon";
    public static final String h = "levelComboboxHelpText";
    public static final String i = "canChangeLevel";
    private static final String[] k = new String[]{"windowTitle", "defaultBuildName", "levels", "defaultSelectedLevel", "iconsList", "defaultSelectedIcon", "levelComboboxHelpText", "canChangeLevel"};
    static final List<bla_0> j = IntStream.range(1, 41).mapToObj(bla_0::new).collect(Collectors.toList());

    @Override
    @Nullable
    public Object b(String string) {
        switch (string) {
            case "windowTitle": {
                return this.a();
            }
            case "defaultBuildName": {
                return this.b();
            }
            case "levels": {
                return this.c();
            }
            case "defaultSelectedLevel": {
                return this.e();
            }
            case "iconsList": {
                return this.f();
            }
            case "defaultSelectedIcon": {
                return this.g();
            }
            case "levelComboboxHelpText": {
                return this.h();
            }
            case "canChangeLevel": {
                return this.j();
            }
        }
        return null;
    }

    abstract String a();

    abstract String b();

    abstract List<blb_0> c();

    abstract blb_0 e();

    public List<bla_0> f() {
        return j;
    }

    @Nullable
    abstract bla_0 g();

    @Nullable
    abstract String h();

    public abstract short i();

    public boolean j() {
        return true;
    }

    @Override
    public String[] d() {
        return k;
    }
}

