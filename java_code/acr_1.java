/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.text.NumberFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/*
 * Renamed from aCR
 */
public class acr_1
implements TableCellRenderer {
    private static final TableCellRenderer a = new DefaultTableCellRenderer();
    private final NumberFormat b = NumberFormat.getIntegerInstance();

    public acr_1() {
        this.b.setGroupingUsed(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        if (object == null) {
            return null;
        }
        if (!(object instanceof Number)) {
            return null;
        }
        int n3 = ((Number)object).intValue();
        return a.getTableCellRendererComponent(jTable, this.b.format(n3), bl, bl2, n, n2);
    }
}

