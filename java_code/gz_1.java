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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from gz
 */
@Deprecated
public final class gz_1
extends GeneratedMessageV3
implements gc_2 {
    private static final long e = 0L;
    int f;
    public static final int a = 1;
    List<gv_1> g;
    public static final int b = 2;
    boolean h;
    public static final int c = 3;
    boolean i;
    private byte j = (byte)-1;
    private static final gz_1 k = new gz_1();
    @Deprecated
    public static final Parser<gz_1> d = new ga_2();

    gz_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private gz_1() {
        this.g = Collections.emptyList();
        this.h = false;
        this.i = false;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    gz_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 10: {
                        if (!(bl & true)) {
                            this.g = new ArrayList<gv_1>();
                            bl |= true;
                        }
                        this.g.add((gv_1)codedInputStream.readMessage(gv_1.d, extensionRegistryLite));
                        continue block12;
                    }
                    case 16: {
                        this.f |= 1;
                        this.h = codedInputStream.readBool();
                        continue block12;
                    }
                    case 24: 
                }
                this.f |= 2;
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
            if (bl & true) {
                this.g = Collections.unmodifiableList(this.g);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return gt_1.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gt_1.b.ensureFieldAccessorsInitialized(gz_1.class, gb_2.class);
    }

    @Override
    public List<gv_1> b() {
        return this.g;
    }

    @Override
    public List<? extends gy_1> c() {
        return this.g;
    }

    @Override
    public int d() {
        return this.g.size();
    }

    @Override
    public gv_1 a(int n) {
        return this.g.get(n);
    }

    @Override
    public gy_1 b(int n) {
        return this.g.get(n);
    }

    @Override
    public boolean e() {
        return (this.f & 1) == 1;
    }

    @Override
    public boolean f() {
        return this.h;
    }

    @Override
    public boolean g() {
        return (this.f & 2) == 2;
    }

    @Override
    public boolean h() {
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
        if (!this.e()) {
            this.j = 0;
            return false;
        }
        if (!this.g()) {
            this.j = 0;
            return false;
        }
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.j = 0;
            return false;
        }
        this.j = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int k = 0; k < this.g.size(); ++k) {
            codedOutputStream.writeMessage(1, (MessageLite)this.g.get(k));
        }
        if ((this.f & 1) == 1) {
            codedOutputStream.writeBool(2, this.h);
        }
        if ((this.f & 2) == 2) {
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
        for (int k = 0; k < this.g.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.g.get(k)));
        }
        if ((this.f & 1) == 1) {
            n += CodedOutputStream.computeBoolSize((int)2, (boolean)this.h);
        }
        if ((this.f & 2) == 2) {
            n += CodedOutputStream.computeBoolSize((int)3, (boolean)this.i);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof gz_1)) {
            return super.equals(object);
        }
        gz_1 gz_12 = (gz_1)object;
        boolean bl = true;
        bl = bl && this.b().equals(gz_12.b());
        boolean bl2 = bl = bl && this.e() == gz_12.e();
        if (this.e()) {
            bl = bl && this.f() == gz_12.f();
        }
        boolean bl3 = bl = bl && this.g() == gz_12.g();
        if (this.g()) {
            bl = bl && this.h() == gz_12.h();
        }
        bl = bl && this.unknownFields.equals((Object)gz_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + gz_1.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        if (this.e()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashBoolean((boolean)this.f());
        }
        if (this.g()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashBoolean((boolean)this.h());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static gz_1 a(ByteBuffer byteBuffer) {
        return (gz_1)d.parseFrom(byteBuffer);
    }

    public static gz_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (gz_1)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static gz_1 a(ByteString byteString) {
        return (gz_1)d.parseFrom(byteString);
    }

    public static gz_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (gz_1)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static gz_1 a(byte[] byArray) {
        return (gz_1)d.parseFrom(byArray);
    }

    public static gz_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (gz_1)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static gz_1 a(InputStream inputStream) {
        return (gz_1)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static gz_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gz_1)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gz_1 b(InputStream inputStream) {
        return (gz_1)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static gz_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gz_1)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gz_1 a(CodedInputStream codedInputStream) {
        return (gz_1)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static gz_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gz_1)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public gb_2 i() {
        return gz_1.j();
    }

    public static gb_2 j() {
        return k.k();
    }

    public static gb_2 a(gz_1 gz_12) {
        return k.k().a(gz_12);
    }

    public gb_2 k() {
        return this == k ? new gb_2() : new gb_2().a(this);
    }

    protected gb_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        gb_2 gb_22 = new gb_2(builderParent);
        return gb_22;
    }

    public static gz_1 l() {
        return k;
    }

    public static Parser<gz_1> m() {
        return d;
    }

    public Parser<gz_1> getParserForType() {
        return d;
    }

    public gz_1 n() {
        return k;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.k();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.i();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.n();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.n();
    }

    static /* synthetic */ boolean o() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean p() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(gz_1 gz_12) {
        return gz_12.unknownFields;
    }
}

