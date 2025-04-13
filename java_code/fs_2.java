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
 * Renamed from fS
 */
public final class fs_2
extends GeneratedMessageV3
implements fw_2 {
    private static final long c = 0L;
    public static final int a = 1;
    MapField<Integer, fo_2> d;
    private byte e = (byte)-1;
    private static final fs_2 f = new fs_2();
    @Deprecated
    public static final Parser<fs_2> b = new ft_2();

    fs_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private fs_2() {
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    fs_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block10: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block10;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block10;
                        bl2 = true;
                        continue block10;
                    }
                    case 10: 
                }
                if (!(bl & true)) {
                    this.d = MapField.newMapField(fv_1.a);
                    bl |= true;
                }
                MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(fv_1.a.getParserForType(), extensionRegistryLite);
                this.d.getMutableMap().put((Integer)mapEntry.getKey(), (fo_2)mapEntry.getValue());
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
        return fr_1.q;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.l();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fr_1.r.ensureFieldAccessorsInitialized(fs_2.class, fu_1.class);
    }

    MapField<Integer, fo_2> l() {
        if (this.d == null) {
            return MapField.emptyMapField(fv_1.a);
        }
        return this.d;
    }

    @Override
    public int b() {
        return this.l().getMap().size();
    }

    @Override
    public boolean a(int n) {
        return this.l().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, fo_2> c() {
        return this.d();
    }

    @Override
    public Map<Integer, fo_2> d() {
        return this.l().getMap();
    }

    @Override
    public fo_2 a(int n, fo_2 fo_22) {
        Map map = this.l().getMap();
        return map.containsKey(n) ? (fo_2)map.get(n) : fo_22;
    }

    @Override
    public fo_2 b(int n) {
        Map map = this.l().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (fo_2)map.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.e;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.e = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.l(), fv_1.a, (int)1);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (Map.Entry entry : this.l().getMap().entrySet()) {
            MapEntry mapEntry = fv_1.a.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((fo_2)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fs_2)) {
            return super.equals(object);
        }
        fs_2 fs_22 = (fs_2)object;
        boolean bl = true;
        bl = bl && this.l().equals(fs_22.l());
        bl = bl && this.unknownFields.equals((Object)fs_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + fs_2.a().hashCode();
        if (!this.l().getMap().isEmpty()) {
            n = 37 * n + 1;
            n = 53 * n + this.l().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static fs_2 a(ByteBuffer byteBuffer) {
        return (fs_2)b.parseFrom(byteBuffer);
    }

    public static fs_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (fs_2)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static fs_2 a(ByteString byteString) {
        return (fs_2)b.parseFrom(byteString);
    }

    public static fs_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (fs_2)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static fs_2 a(byte[] byArray) {
        return (fs_2)b.parseFrom(byArray);
    }

    public static fs_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (fs_2)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static fs_2 a(InputStream inputStream) {
        return (fs_2)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static fs_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fs_2)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fs_2 b(InputStream inputStream) {
        return (fs_2)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static fs_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fs_2)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fs_2 a(CodedInputStream codedInputStream) {
        return (fs_2)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static fs_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fs_2)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public fu_1 e() {
        return fs_2.f();
    }

    public static fu_1 f() {
        return f.g();
    }

    public static fu_1 a(fs_2 fs_22) {
        return f.g().a(fs_22);
    }

    public fu_1 g() {
        return this == f ? new fu_1() : new fu_1().a(this);
    }

    protected fu_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        fu_1 fu_12 = new fu_1(builderParent);
        return fu_12;
    }

    public static fs_2 h() {
        return f;
    }

    public static Parser<fs_2> i() {
        return b;
    }

    public Parser<fs_2> getParserForType() {
        return b;
    }

    public fs_2 j() {
        return f;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.j();
    }

    static /* synthetic */ boolean k() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(fs_2 fs_22) {
        return fs_22.unknownFields;
    }
}

