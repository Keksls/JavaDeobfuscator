/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import org.apache.log4j.Logger;

/*
 * Renamed from ajr
 */
public class ajr_0
extends JFrame {
    protected static final Logger a = Logger.getLogger(ajr_0.class);
    private ajp_0 b = null;

    public ajr_0() {
        this.setDefaultCloseOperation(3);
    }

    public void a() {
    }

    public void a(boolean bl) {
    }

    public boolean b() {
        return false;
    }

    @Override
    protected void processWindowEvent(WindowEvent windowEvent) {
    }

    public void a(ajp_0 ajp_02) {
        if (ajp_02 != null) {
            this.b = ajp_02;
        }
    }
}

