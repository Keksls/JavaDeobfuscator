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
 *  com.google.protobuf.Internal
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from iy
 */
public final class iy_1
extends GeneratedMessageV3
implements ib_1 {
    private static final long e = 0L;
    int f;
    public static final int a = 1;
    long g;
    public static final int b = 2;
    int h;
    public static final int c = 3;
    boolean i;
    private byte j = (byte)-1;
    private static final iy_1 k = new iy_1();
    @Deprecated
    public static final Parser<iy_1> d = new iz_1();

    iy_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private iy_1() {
        this.g = 0L;
        this.h = 0;
        this.i = false;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    iy_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block12;
                        bl2 = true;
                        continue block12;
                    }
                    case 8: {
                        this.f |= 1;
                        this.g = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 16: {
                        this.f |= 2;
                        this.h = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 24: 
                }
                this.f |= 4;
                this.i = codedInputStream.readBool();
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
        return io_0.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io_0.h.ensureFieldAccessorsInitialized(iy_1.class, ia_1.class);
    }

    @Override
    public boolean b() {
        return (this.f & 1) == 1;
    }

    @Override
    public long c() {
        return this.g;
    }

    @Override
    public boolean d() {
        return (this.f & 2) == 2;
    }

    @Override
    public int e() {
        return this.h;
    }

    @Override
    public boolean f() {
        return (this.f & 4) == 4;
    }

    @Override
    public boolean g() {
        return this.i;
    }

    public final boolean isInitialized() {
        byte by = this.j;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.j = 0;
            return false;
        }
        if (!this.d()) {
            this.j = 0;
            return false;
        }
        if (!this.f()) {
            this.j = 0;
            return false;
        }
        this.j = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.f & 1) == 1) {
            codedOutputStream.writeInt64(1, this.g);
        }
        if ((this.f & 2) == 2) {
            codedOutputStream.writeInt32(2, this.h);
        }
        if ((this.f & 4) == 4) {
            codedOutputStream.writeBool(3, this.i);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.f & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.g);
        }
        if ((this.f & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.h);
        }
        if ((this.f & 4) == 4) {
            n += CodedOutputStream.computeBoolSize((int)3, (boolean)this.i);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof iy_1)) {
            return super.equals(object);
        }
        iy_1 iy_12 = (iy_1)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == iy_12.b();
        if (this.b()) {
            bl = bl && this.c() == iy_12.c();
        }
        boolean bl3 = bl = bl && this.d() == iy_12.d();
        if (this.d()) {
            bl = bl && this.e() == iy_12.e();
        }
        boolean bl4 = bl = bl && this.f() == iy_12.f();
        if (this.f()) {
            bl = bl && this.g() == iy_12.g();
        }
        bl = bl && this.unknownFields.equals((Object)iy_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + iy_1.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e();
        }
        if (this.f()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashBoolean((boolean)this.g());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static iy_1 a(ByteBuffer byteBuffer) {
        return (iy_1)d.parseFrom(byteBuffer);
    }

    public static iy_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (iy_1)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static iy_1 a(ByteString byteString) {
        return (iy_1)d.parseFrom(byteString);
    }

    public static iy_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (iy_1)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static iy_1 a(byte[] byArray) {
        return (iy_1)d.parseFrom(byArray);
    }

    public static iy_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (iy_1)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static iy_1 a(InputStream inputStream) {
        return (iy_1)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static iy_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iy_1)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iy_1 b(InputStream inputStream) {
        return (iy_1)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static iy_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iy_1)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static iy_1 a(CodedInputStream codedInputStream) {
        return (iy_1)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static iy_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (iy_1)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ia_1 h() {
        return iy_1.i();
    }

    public static ia_1 i() {
        return k.j();
    }

    public static ia_1 a(iy_1 iy_12) {
        return k.j().a(iy_12);
    }

    public ia_1 j() {
        return this == k ? new ia_1() : new ia_1().a(this);
    }

    protected ia_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        ia_1 ia_12 = new ia_1(builderParent);
        return ia_12;
    }

    public static iy_1 k() {
        return k;
    }

    public static Parser<iy_1> l() {
        return d;
    }

    public Parser<iy_1> getParserForType() {
        return d;
    }

    public iy_1 m() {
        return k;
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

    static /* synthetic */ UnknownFieldSet b(iy_1 iy_12) {
        return iy_12.unknownFields;
    }
}

