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
 * Renamed from z
 */
public final class z_0
extends GeneratedMessageV3
implements d_0 {
    private static final long e = 0L;
    int f = 0;
    Object g;
    public static final int a = 1;
    volatile Object h;
    public static final int b = 2;
    int i;
    public static final int c = 3;
    public static final int d = 4;
    private byte j = (byte)-1;
    private static final z_0 k = new z_0();
    static final Parser<z_0> l = new a_0();

    z_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private z_0() {
        this.h = "";
        this.i = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    z_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                String string;
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block13;
                        bl2 = true;
                        continue block13;
                    }
                    case 10: {
                        string = codedInputStream.readStringRequireUtf8();
                        this.h = string;
                        continue block13;
                    }
                    case 16: {
                        this.i = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 26: {
                        string = codedInputStream.readStringRequireUtf8();
                        this.f = 3;
                        this.g = string;
                        continue block13;
                    }
                    case 34: 
                }
                string = codedInputStream.readStringRequireUtf8();
                this.f = 4;
                this.g = string;
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
        return g_0.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.d.ensureFieldAccessorsInitialized(z_0.class, b_0.class);
    }

    @Override
    public c_0 b() {
        return c_0.b(this.f);
    }

    @Override
    public String c() {
        Object object = this.h;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.h = string;
        return string;
    }

    @Override
    public ByteString d() {
        Object object = this.h;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.h = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public int e() {
        return this.i;
    }

    @Override
    public String f() {
        Object object = "";
        if (this.f == 3) {
            object = this.g;
        }
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (this.f == 3) {
            this.g = string;
        }
        return string;
    }

    @Override
    public ByteString g() {
        Object object = "";
        if (this.f == 3) {
            object = this.g;
        }
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            if (this.f == 3) {
                this.g = byteString;
            }
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public String h() {
        Object object = "";
        if (this.f == 4) {
            object = this.g;
        }
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (this.f == 4) {
            this.g = string;
        }
        return string;
    }

    @Override
    public ByteString i() {
        Object object = "";
        if (this.f == 4) {
            object = this.g;
        }
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            if (this.f == 4) {
                this.g = byteString;
            }
            return byteString;
        }
        return (ByteString)object;
    }

    public final boolean isInitialized() {
        byte by = this.j;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.j = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.d().isEmpty()) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.h);
        }
        if (this.i != 0) {
            codedOutputStream.writeInt32(2, this.i);
        }
        if (this.f == 3) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.g);
        }
        if (this.f == 4) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)4, (Object)this.g);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (!this.d().isEmpty()) {
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.h);
        }
        if (this.i != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.i);
        }
        if (this.f == 3) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.g);
        }
        if (this.f == 4) {
            n += GeneratedMessageV3.computeStringSize((int)4, (Object)this.g);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof z_0)) {
            return super.equals(object);
        }
        z_0 z_02 = (z_0)object;
        boolean bl = true;
        bl = bl && this.c().equals(z_02.c());
        bl = bl && this.e() == z_02.e();
        boolean bl2 = bl = bl && this.b().equals((Object)z_02.b());
        if (!bl) {
            return false;
        }
        switch (this.f) {
            case 3: {
                bl = bl && this.f().equals(z_02.f());
                break;
            }
            case 4: {
                bl = bl && this.h().equals(z_02.h());
                break;
            }
        }
        bl = bl && this.unknownFields.equals((Object)z_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + z_0.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + this.c().hashCode();
        n = 37 * n + 2;
        n = 53 * n + this.e();
        switch (this.f) {
            case 3: {
                n = 37 * n + 3;
                n = 53 * n + this.f().hashCode();
                break;
            }
            case 4: {
                n = 37 * n + 4;
                n = 53 * n + this.h().hashCode();
                break;
            }
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static z_0 a(ByteBuffer byteBuffer) {
        return (z_0)l.parseFrom(byteBuffer);
    }

    public static z_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (z_0)l.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static z_0 a(ByteString byteString) {
        return (z_0)l.parseFrom(byteString);
    }

    public static z_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (z_0)l.parseFrom(byteString, extensionRegistryLite);
    }

    public static z_0 a(byte[] byArray) {
        return (z_0)l.parseFrom(byArray);
    }

    public static z_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (z_0)l.parseFrom(byArray, extensionRegistryLite);
    }

    public static z_0 a(InputStream inputStream) {
        return (z_0)GeneratedMessageV3.parseWithIOException(l, (InputStream)inputStream);
    }

    public static z_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (z_0)GeneratedMessageV3.parseWithIOException(l, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static z_0 b(InputStream inputStream) {
        return (z_0)GeneratedMessageV3.parseDelimitedWithIOException(l, (InputStream)inputStream);
    }

    public static z_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (z_0)GeneratedMessageV3.parseDelimitedWithIOException(l, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static z_0 a(CodedInputStream codedInputStream) {
        return (z_0)GeneratedMessageV3.parseWithIOException(l, (CodedInputStream)codedInputStream);
    }

    public static z_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (z_0)GeneratedMessageV3.parseWithIOException(l, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public b_0 j() {
        return z_0.k();
    }

    public static b_0 k() {
        return k.l();
    }

    public static b_0 a(z_0 z_02) {
        return k.l().a(z_02);
    }

    public b_0 l() {
        return this == k ? new b_0() : new b_0().a(this);
    }

    protected b_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        b_0 b_02 = new b_0(builderParent);
        return b_02;
    }

    public static z_0 m() {
        return k;
    }

    public static Parser<z_0> n() {
        return l;
    }

    public Parser<z_0> getParserForType() {
        return l;
    }

    public z_0 o() {
        return k;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.o();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.o();
    }

    static /* synthetic */ boolean p() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(z_0 z_02) {
        return z_02.unknownFields;
    }

    static /* synthetic */ void b(ByteString byteString) {
        z_0.checkByteStringIsUtf8((ByteString)byteString);
    }

    static /* synthetic */ void c(ByteString byteString) {
        z_0.checkByteStringIsUtf8((ByteString)byteString);
    }

    static /* synthetic */ void d(ByteString byteString) {
        z_0.checkByteStringIsUtf8((ByteString)byteString);
    }
}

