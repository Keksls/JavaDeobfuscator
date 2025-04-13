/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLAutoDrawable
 */
import com.jogamp.opengl.GLAutoDrawable;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.JComponent;
import javax.swing.JDialog;

/*
 * Renamed from cdD
 */
public class cdd_2
implements aej_1,
ahj,
azv_2 {
    private final cde_2 a = new cde_2();

    public static void a(String[] stringArray) {
        JDialog jDialog = new JDialog();
        jDialog.add(new cde_2());
        jDialog.setVisible(true);
    }

    @Override
    public void a(GLAutoDrawable gLAutoDrawable) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null) {
            aff_1 aff_12 = bmr_12.gg();
            this.a.a(aff_12, bmr_12.T_());
        }
    }

    @Override
    public void a(YK yK) {
        yK.e().a(this);
        yK.e().a(this, true);
    }

    @Override
    public void b(YK yK) {
        yK.e().b(this);
        yK.e().a(this);
    }

    @Override
    public JComponent a() {
        return this.a;
    }

    @Override
    public String b() {
        return "Position Viewer";
    }

    @Override
    public void b(GLAutoDrawable gLAutoDrawable) {
    }

    @Override
    public void a(GLAutoDrawable gLAutoDrawable, int n, int n2, int n3, int n4) {
    }

    @Override
    public void a(GLAutoDrawable gLAutoDrawable, boolean bl, boolean bl2) {
    }

    @Override
    public boolean a(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean b(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean c(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean d(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean e(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean f(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean g(MouseEvent mouseEvent) {
        ace_0 ace_02 = ans_0.D().c();
        aff_1 aff_12 = agz.a(ace_02, mouseEvent.getX(), mouseEvent.getY(), false);
        this.a.a(aff_12);
        return false;
    }

    @Override
    public boolean a(MouseWheelEvent mouseWheelEvent) {
        return false;
    }
}

