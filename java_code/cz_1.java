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
 * Renamed from cZ
 */
public final class cz_1
extends GeneratedMessageV3
implements dc_2 {
    private static final long c = 0L;
    public static final int a = 1;
    long d;
    public static final int b = 2;
    int e;
    private byte f = (byte)-1;
    private static final cz_1 g = new cz_1();
    static final Parser<cz_1> h = new da_2();

    cz_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private cz_1() {
        this.d = 0L;
        this.e = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    cz_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n;
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n2)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 8: {
                        this.d = codedInputStream.readInt64();
                        continue block11;
                    }
                    case 16: 
                }
                this.e = n = codedInputStream.readEnum();
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
        return ak_2.A;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.B.ensureFieldAccessorsInitialized(cz_1.class, db_2.class);
    }

    @Override
    public long b() {
        return this.d;
    }

    @Override
    public int c() {
        return this.e;
    }

    @Override
    public cx_1 d() {
        cx_1 cx_12 = cx_1.a(this.e);
        return cx_12 == null ? cx_1.d : cx_12;
    }

    public final boolean isInitialized() {
        byte by = this.f;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.f = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.d != 0L) {
            codedOutputStream.writeInt64(1, this.d);
        }
        if (this.e != cx_1.a.getNumber()) {
            codedOutputStream.writeEnum(2, this.e);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.d != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.d);
        }
        if (this.e != cx_1.a.getNumber()) {
            n += CodedOutputStream.computeEnumSize((int)2, (int)this.e);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof cz_1)) {
            return super.equals(object);
        }
        cz_1 cz_12 = (cz_1)object;
        boolean bl = true;
        bl = bl && this.b() == cz_12.b();
        bl = bl && this.e == cz_12.e;
        bl = bl && this.unknownFields.equals((Object)cz_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + cz_1.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.b());
        n = 37 * n + 2;
        n = 53 * n + this.e;
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static cz_1 a(ByteBuffer byteBuffer) {
        return (cz_1)h.parseFrom(byteBuffer);
    }

    public static cz_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (cz_1)h.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static cz_1 a(ByteString byteString) {
        return (cz_1)h.parseFrom(byteString);
    }

    public static cz_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (cz_1)h.parseFrom(byteString, extensionRegistryLite);
    }

    public static cz_1 a(byte[] byArray) {
        return (cz_1)h.parseFrom(byArray);
    }

    public static cz_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (cz_1)h.parseFrom(byArray, extensionRegistryLite);
    }

    public static cz_1 a(InputStream inputStream) {
        return (cz_1)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream);
    }

    public static cz_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cz_1)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cz_1 b(InputStream inputStream) {
        return (cz_1)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream);
    }

    public static cz_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cz_1)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cz_1 a(CodedInputStream codedInputStream) {
        return (cz_1)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream);
    }

    public static cz_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cz_1)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public db_2 e() {
        return cz_1.f();
    }

    public static db_2 f() {
        return g.g();
    }

    public static db_2 a(cz_1 cz_12) {
        return g.g().a(cz_12);
    }

    public db_2 g() {
        return this == g ? new db_2() : new db_2().a(this);
    }

    protected db_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        db_2 db_22 = new db_2(builderParent);
        return db_22;
    }

    public static cz_1 h() {
        return g;
    }

    public static Parser<cz_1> i() {
        return h;
    }

    public Parser<cz_1> getParserForType() {
        return h;
    }

    public cz_1 j() {
        return g;
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

    static /* synthetic */ UnknownFieldSet b(cz_1 cz_12) {
        return cz_12.unknownFields;
    }
}

