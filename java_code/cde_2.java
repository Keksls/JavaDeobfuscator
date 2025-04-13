/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Renamed from cdE
 */
class cde_2
extends JPanel {
    private final JTextField a = this.a("perso", 0);
    private final JTextField b = this.a("souris", 1);

    cde_2() {
        super(new GridBagLayout(), true);
    }

    private JTextField a(String string, int n) {
        JTextField jTextField = new JTextField();
        jTextField.setEnabled(false);
        jTextField.setDisabledTextColor(Color.BLACK);
        jTextField.setHorizontalAlignment(2);
        jTextField.setPreferredSize(new Dimension(170, 18));
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = n;
        gridBagConstraints.weightx = 0.0;
        this.add((Component)new JLabel(string), gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        this.add((Component)jTextField, gridBagConstraints);
        return jTextField;
    }

    private void a(JTextField jTextField, aff_1 aff_12, Long l) {
        if (aff_12 == null) {
            jTextField.setText("null");
        } else {
            cch_1 cch_12;
            Object object = String.format("%s, %s, %s", aff_12.d(), aff_12.e(), aff_12.f());
            if (l != null) {
                object = (String)object + " @" + l;
            }
            if ((cch_12 = (cch_1)ccm_1.g().c(aff_12.d(), aff_12.e())) != null) {
                object = (String)object + String.format(" (P %s, %s)", cch_12.a(), cch_12.b());
            }
            jTextField.setText((String)object);
        }
    }

    void a(aff_1 aff_12, long l) {
        this.a(this.a, aff_12, l);
    }

    void a(aff_1 aff_12) {
        this.a(this.b, aff_12, null);
    }
}

