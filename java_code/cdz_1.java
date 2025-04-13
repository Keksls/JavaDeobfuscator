/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cdZ
 */
public class cdz_1
implements ajh_1 {
    private static final String b = "textWidgetStyles";
    private static final String d = "containerStyles";
    private static final String e = "imageStyles";
    private static final String f = "buttonStyles";
    private static final String g = "textEditorStyles";
    private static final String h = "textEditorPlusStyles";
    private static final String i = "radioButtonStyles";
    private static final String j = "checkBoxStyles";
    private static final String k = "progressBarStyles";
    private static final String l = "colors";
    private static final String m = "fonts";
    private static final String n = "events";
    public static final String[] a = new String[]{"textWidgetStyles", "containerStyles", "imageStyles", "buttonStyles", "textEditorStyles", "textEditorPlusStyles", "checkBoxStyles", "progressBarStyles", "colors", "fonts", "events"};
    private final Function<String, Stream<String>> o;
    @NotNull
    private final cea_2 p = new cea_2();

    public cdz_1(Function<String, Stream<String>> function) {
        this.o = function;
    }

    @Override
    public String[] d() {
        return a;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (b.equals(string)) {
            return this.a("textWidget");
        }
        if (d.equals(string)) {
            return this.a("container");
        }
        if (e.equals(string)) {
            return this.a("image");
        }
        if (f.equals(string)) {
            return this.a("button");
        }
        if (g.equals(string)) {
            return this.a("textEditor");
        }
        if (h.equals(string)) {
            return this.a("textEditorPlus");
        }
        if (i.equals(string)) {
            return this.a("radioButton");
        }
        if (j.equals(string)) {
            return this.a("checkBox");
        }
        if (k.equals(string)) {
            return this.a("progressBar");
        }
        if (l.equals(string)) {
            return fys_0.a.a().stream().sorted(String::compareTo).collect(Collectors.toList());
        }
        if (m.equals(string)) {
            return fpm_0.b().g().j().entrySet().stream().map(entry -> new ceb_2(this, (String)entry.getKey(), (List)entry.getValue())).sorted(Comparator.comparing(ceb_2::a)).collect(Collectors.toUnmodifiableList());
        }
        if (n.equals(string)) {
            return this.p;
        }
        return null;
    }

    @NotNull
    private List<String> a(String string2) {
        return this.o.apply(string2).sorted().distinct().map(string -> string.isEmpty() ? "[Default]" : string).collect(Collectors.toList());
    }
}

