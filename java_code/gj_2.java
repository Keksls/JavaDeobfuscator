/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MapEntry
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/*
 * Renamed from gj
 */
public final class gj_2
extends GeneratedMessageV3
implements gn_2 {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    MapField<Integer, gf_2> f;
    public static final int b = 2;
    dw_1 g;
    private byte h = (byte)-1;
    private static final gj_2 i = new gj_2();
    @Deprecated
    public static final Parser<gj_2> c = new gk_2();

    gj_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private gj_2() {
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    gj_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                Object object;
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.f = MapField.newMapField(gm_2.a);
                            bl |= true;
                        }
                        object = (MapEntry)codedInputStream.readMessage(gm_2.a.getParserForType(), extensionRegistryLite);
                        this.f.getMutableMap().put((Integer)object.getKey(), (gf_2)object.getValue());
                        continue block11;
                    }
                    case 18: 
                }
                object = null;
                if ((this.e & 1) == 1) {
                    object = this.g.n();
                }
                this.g = (dw_1)codedInputStream.readMessage(dw_1.e, extensionRegistryLite);
                if (object != null) {
                    ((dy_1)object).a(this.g);
                    this.g = ((dy_1)object).o();
                }
                this.e |= 1;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return gd_2.a;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.o();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gd_2.b.ensureFieldAccessorsInitialized(gj_2.class, gl_2.class);
    }

    MapField<Integer, gf_2> o() {
        if (this.f == null) {
            return MapField.emptyMapField(gm_2.a);
        }
        return this.f;
    }

    @Override
    public int b() {
        return this.o().getMap().size();
    }

    @Override
    public boolean a(int n) {
        return this.o().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, gf_2> c() {
        return this.d();
    }

    @Override
    public Map<Integer, gf_2> d() {
        return this.o().getMap();
    }

    @Override
    public gf_2 a(int n, gf_2 gf_22) {
        Map map = this.o().getMap();
        return map.containsKey(n) ? (gf_2)map.get(n) : gf_22;
    }

    @Override
    public gf_2 b(int n) {
        Map map = this.o().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (gf_2)map.get(n);
    }

    @Override
    public boolean e() {
        return (this.e & 1) == 1;
    }

    @Override
    public dw_1 f() {
        return this.g == null ? dw_1.o() : this.g;
    }

    @Override
    public db_1 g() {
        return this.g == null ? dw_1.o() : this.g;
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (gf_2 gf_22 : this.d().values()) {
            if (gf_22.isInitialized()) continue;
            this.h = 0;
            return false;
        }
        if (this.e() && !this.f().isInitialized()) {
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.o(), gm_2.a, (int)1);
        if ((this.e & 1) == 1) {
            codedOutputStream.writeMessage(2, (MessageLite)this.f());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (Map.Entry entry : this.o().getMap().entrySet()) {
            MapEntry mapEntry = gm_2.a.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((gf_2)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)mapEntry);
        }
        if ((this.e & 1) == 1) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.f());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof gj_2)) {
            return super.equals(object);
        }
        gj_2 gj_22 = (gj_2)object;
        boolean bl = true;
        bl = bl && this.o().equals(gj_22.o());
        boolean bl2 = bl = bl && this.e() == gj_22.e();
        if (this.e()) {
            bl = bl && this.f().equals(gj_22.f());
        }
        bl = bl && this.unknownFields.equals((Object)gj_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + gj_2.a().hashCode();
        if (!this.o().getMap().isEmpty()) {
            n = 37 * n + 1;
            n = 53 * n + this.o().hashCode();
        }
        if (this.e()) {
            n = 37 * n + 2;
            n = 53 * n + this.f().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static gj_2 a(ByteBuffer byteBuffer) {
        return (gj_2)c.parseFrom(byteBuffer);
    }

    public static gj_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (gj_2)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static gj_2 a(ByteString byteString) {
        return (gj_2)c.parseFrom(byteString);
    }

    public static gj_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (gj_2)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static gj_2 a(byte[] byArray) {
        return (gj_2)c.parseFrom(byArray);
    }

    public static gj_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (gj_2)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static gj_2 a(InputStream inputStream) {
        return (gj_2)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static gj_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gj_2)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gj_2 b(InputStream inputStream) {
        return (gj_2)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static gj_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gj_2)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gj_2 a(CodedInputStream codedInputStream) {
        return (gj_2)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static gj_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gj_2)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public gl_2 h() {
        return gj_2.i();
    }

    public static gl_2 i() {
        return i.j();
    }

    public static gl_2 a(gj_2 gj_22) {
        return i.j().a(gj_22);
    }

    public gl_2 j() {
        return this == i ? new gl_2() : new gl_2().a(this);
    }

    protected gl_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        gl_2 gl_22 = new gl_2(builderParent);
        return gl_22;
    }

    public static gj_2 k() {
        return i;
    }

    public static Parser<gj_2> l() {
        return c;
    }

    public Parser<gj_2> getParserForType() {
        return c;
    }

    public gj_2 m() {
        return i;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.j();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.h();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.m();
    }

    static /* synthetic */ boolean n() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(gj_2 gj_22) {
        return gj_22.unknownFields;
    }
}

