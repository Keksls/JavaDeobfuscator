/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.wakfu.client.console.command.commonIn.TakeScreenShotCommand;
import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aZh
 */
public final class azh_0
implements azw_2 {
    public File b;

    @Override
    @NotNull
    public File a() {
        return this.b;
    }

    @Override
    public void b() {
        String string;
        File file = this.b.getParentFile();
        try {
            string = file != null ? file.getCanonicalPath() : this.b.getCanonicalPath();
        }
        catch (IOException iOException) {
            string = file != null ? file.getAbsolutePath() : this.b.getAbsolutePath();
        }
        string = string.replaceAll("\\\\", "\\\\\\\\");
        aUh.b("screenshot.took", this.a(string, this.b.getName()));
    }

    @Override
    public void a(Exception exception) {
        aUh.b("screenshot.fail", new Object[0]);
        TakeScreenShotCommand.a.error((Object)"Erreur lors de la prise de screenShot", (Throwable)exception);
    }

    private String a(@NotNull String string, String string2) {
        return "<u id=\"fileExplorer_" + string + "\">" + string2 + "</u>";
    }
}

