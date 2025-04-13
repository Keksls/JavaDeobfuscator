/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;

public class aWM
extends aXj {
    private static final Pattern c = Pattern.compile("\"");
    private static avv_0 d;
    private static final int e = 0xFF0000;
    protected static final String[] a;
    public static final azf_2 b;
    private final boolean f;
    private final String g;

    public static void a(avv_0 avv_02) {
        d = avv_02;
    }

    public static avv_0 c() {
        return d;
    }

    public aWM() {
        this.g = "";
        this.f = false;
    }

    public aWM(boolean bl) {
        this.g = "";
        this.f = bl;
    }

    public aWM(String string) {
        this.g = string;
        this.f = false;
    }

    public aWM(String string, boolean bl) {
        this.g = string;
        this.f = bl;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void b() {
        ani_2 ani_22 = new ani_2();
        for (awn_0 awn_02 : d.a()) {
            if ((this.g.isEmpty() || !awn_02.a.toLowerCase().contains(c.matcher(this.g).replaceAll("").toLowerCase())) && !this.g.isEmpty()) continue;
            awn_02.a(ani_22, this.f);
        }
        String string = ani_22.r();
        if (!string.isEmpty()) {
            aVo.a().c(string);
        } else {
            aVo.a().a("La commande n'existe pas.", 0xFF0000);
        }
    }

    public String toString() {
        return "HelpCommand{m_command='" + this.g + "'}";
    }

    static {
        a = new String[]{"None", "Root", "Admin", "Staff", "Moderator"};
        b = new azf_2(0.0f, 0.7f, 0.0f, 1.0f);
    }
}

