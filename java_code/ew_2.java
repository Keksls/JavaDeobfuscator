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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from ew
 */
public final class ew_2
extends GeneratedMessageV3
implements ez_2 {
    private static final long c = 0L;
    int d;
    public static final int a = 1;
    int e;
    private byte f = (byte)-1;
    private static final ew_2 g = new ew_2();
    @Deprecated
    public static final Parser<ew_2> b = new ex_2();

    ew_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ew_2() {
        this.e = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ew_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 8: 
                }
                this.d |= 1;
                this.e = codedInputStream.readInt32();
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
        return eu_2.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eu_2.d.ensureFieldAccessorsInitialized(ew_2.class, ey_2.class);
    }

    @Override
    public boolean b() {
        return (this.d & 1) == 1;
    }

    @Override
    public int c() {
        return this.e;
    }

    public final boolean isInitialized() {
        byte by = this.f;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.f = 0;
            return false;
        }
        this.f = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.d & 1) == 1) {
            codedOutputStream.writeInt32(1, this.e);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.d & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.e);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ew_2)) {
            return super.equals(object);
        }
        ew_2 ew_22 = (ew_2)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == ew_22.b();
        if (this.b()) {
            bl = bl && this.c() == ew_22.c();
        }
        bl = bl && this.unknownFields.equals((Object)ew_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ew_2.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ew_2 a(ByteBuffer byteBuffer) {
        return (ew_2)b.parseFrom(byteBuffer);
    }

    public static ew_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ew_2)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ew_2 a(ByteString byteString) {
        return (ew_2)b.parseFrom(byteString);
    }

    public static ew_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ew_2)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static ew_2 a(byte[] byArray) {
        return (ew_2)b.parseFrom(byArray);
    }

    public static ew_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ew_2)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static ew_2 a(InputStream inputStream) {
        return (ew_2)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static ew_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ew_2)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ew_2 b(InputStream inputStream) {
        return (ew_2)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static ew_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ew_2)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ew_2 a(CodedInputStream codedInputStream) {
        return (ew_2)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static ew_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ew_2)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ey_2 d() {
        return ew_2.e();
    }

    public static ey_2 e() {
        return g.f();
    }

    public static ey_2 a(ew_2 ew_22) {
        return g.f().a(ew_22);
    }

    public ey_2 f() {
        return this == g ? new ey_2() : new ey_2().a(this);
    }

    protected ey_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        ey_2 ey_22 = new ey_2(builderParent);
        return ey_22;
    }

    public static ew_2 g() {
        return g;
    }

    public static Parser<ew_2> h() {
        return b;
    }

    public Parser<ew_2> getParserForType() {
        return b;
    }

    public ew_2 i() {
        return g;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.f();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.d();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.d();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.i();
    }

    static /* synthetic */ boolean j() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ew_2 ew_22) {
        return ew_22.unknownFields;
    }
}

