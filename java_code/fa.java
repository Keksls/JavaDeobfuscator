/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

public final class fa
extends GeneratedMessageV3.Builder<fa>
implements fb {
    private int a;
    private long b;
    private Object c = "";
    private boolean d;
    private Object e = "";
    private boolean f;
    private int g = -1;
    private int h = -1;
    private Object i = "";
    private long j = -1L;

    public static final Descriptors.Descriptor a() {
        return eT.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eT.h.ensureFieldAccessorsInitialized(eY.class, fa.class);
    }

    fa() {
        this.K();
    }

    fa(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.K();
    }

    private void K() {
        if (eY.C()) {
            // empty if block
        }
    }

    public fa w() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = "";
        this.a &= 0xFFFFFFFD;
        this.d = false;
        this.a &= 0xFFFFFFFB;
        this.e = "";
        this.a &= 0xFFFFFFF7;
        this.f = false;
        this.a &= 0xFFFFFFEF;
        this.g = -1;
        this.a &= 0xFFFFFFDF;
        this.h = -1;
        this.a &= 0xFFFFFFBF;
        this.i = "";
        this.a &= 0xFFFFFF7F;
        this.j = -1L;
        this.a &= 0xFFFFFEFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return eT.g;
    }

    public eY x() {
        return eY.z();
    }

    public eY y() {
        eY eY2 = this.z();
        if (!eY2.isInitialized()) {
            throw fa.newUninitializedMessageException((Message)eY2);
        }
        return eY2;
    }

    public eY z() {
        eY eY2 = new eY(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        eY2.m = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        eY2.n = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        eY2.o = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        eY2.p = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        eY2.q = this.f;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        eY2.r = this.g;
        if ((n & 0x40) == 64) {
            n2 |= 0x40;
        }
        eY2.s = this.h;
        if ((n & 0x80) == 128) {
            n2 |= 0x80;
        }
        eY2.t = this.i;
        if ((n & 0x100) == 256) {
            n2 |= 0x100;
        }
        eY2.u = this.j;
        eY2.l = n2;
        this.onBuilt();
        return eY2;
    }

    public fa A() {
        return (fa)super.clone();
    }

    public fa a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fa)super.setField(fieldDescriptor, object);
    }

    public fa a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (fa)super.clearField(fieldDescriptor);
    }

    public fa a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (fa)super.clearOneof(oneofDescriptor);
    }

    public fa a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (fa)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public fa b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fa)super.addRepeatedField(fieldDescriptor, object);
    }

    public fa a(Message message) {
        if (message instanceof eY) {
            return this.a((eY)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public fa a(eY eY2) {
        if (eY2 == eY.z()) {
            return this;
        }
        if (eY2.b()) {
            this.a(eY2.c());
        }
        if (eY2.d()) {
            this.a |= 2;
            this.c = eY2.n;
            this.onChanged();
        }
        if (eY2.g()) {
            this.a(eY2.h());
        }
        if (eY2.i()) {
            this.a |= 8;
            this.e = eY2.p;
            this.onChanged();
        }
        if (eY2.l()) {
            this.b(eY2.m());
        }
        if (eY2.n()) {
            this.a(eY2.o());
        }
        if (eY2.p()) {
            this.b(eY2.q());
        }
        if (eY2.r()) {
            this.a |= 0x80;
            this.i = eY2.t;
            this.onChanged();
        }
        if (eY2.u()) {
            this.b(eY2.v());
        }
        this.b(eY.b(eY2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        if (!this.d()) {
            return false;
        }
        return this.g();
    }

    public fa a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        eY eY2 = null;
        try {
            eY2 = (eY)eY.j.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            eY2 = (eY)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (eY2 != null) {
                this.a(eY2);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public long c() {
        return this.b;
    }

    public fa a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public fa B() {
        this.a &= 0xFFFFFFFE;
        this.b = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public String e() {
        Object object = this.c;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.c = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString f() {
        Object object = this.c;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.c = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public fa a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = string;
        this.onChanged();
        return this;
    }

    public fa C() {
        this.a &= 0xFFFFFFFD;
        this.c = eY.z().e();
        this.onChanged();
        return this;
    }

    public fa a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean g() {
        return (this.a & 4) == 4;
    }

    @Override
    public boolean h() {
        return this.d;
    }

    public fa a(boolean bl) {
        this.a |= 4;
        this.d = bl;
        this.onChanged();
        return this;
    }

    public fa D() {
        this.a &= 0xFFFFFFFB;
        this.d = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean i() {
        return (this.a & 8) == 8;
    }

    @Override
    public String j() {
        Object object = this.e;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.e = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString k() {
        Object object = this.e;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.e = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public fa b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 8;
        this.e = string;
        this.onChanged();
        return this;
    }

    public fa E() {
        this.a &= 0xFFFFFFF7;
        this.e = eY.z().j();
        this.onChanged();
        return this;
    }

    public fa b(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 8;
        this.e = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean l() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public boolean m() {
        return this.f;
    }

    public fa b(boolean bl) {
        this.a |= 0x10;
        this.f = bl;
        this.onChanged();
        return this;
    }

    public fa F() {
        this.a &= 0xFFFFFFEF;
        this.f = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean n() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public int o() {
        return this.g;
    }

    public fa a(int n) {
        this.a |= 0x20;
        this.g = n;
        this.onChanged();
        return this;
    }

    public fa G() {
        this.a &= 0xFFFFFFDF;
        this.g = -1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean p() {
        return (this.a & 0x40) == 64;
    }

    @Override
    public int q() {
        return this.h;
    }

    public fa b(int n) {
        this.a |= 0x40;
        this.h = n;
        this.onChanged();
        return this;
    }

    public fa H() {
        this.a &= 0xFFFFFFBF;
        this.h = -1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean r() {
        return (this.a & 0x80) == 128;
    }

    @Override
    public String s() {
        Object object = this.i;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.i = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString t() {
        Object object = this.i;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.i = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public fa c(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 0x80;
        this.i = string;
        this.onChanged();
        return this;
    }

    public fa I() {
        this.a &= 0xFFFFFF7F;
        this.i = eY.z().s();
        this.onChanged();
        return this;
    }

    public fa c(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 0x80;
        this.i = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean u() {
        return (this.a & 0x100) == 256;
    }

    @Override
    public long v() {
        return this.j;
    }

    public fa b(long l) {
        this.a |= 0x100;
        this.j = l;
        this.onChanged();
        return this;
    }

    public fa J() {
        this.a &= 0xFFFFFEFF;
        this.j = -1L;
        this.onChanged();
        return this;
    }

    public final fa a(UnknownFieldSet unknownFieldSet) {
        return (fa)super.setUnknownFields(unknownFieldSet);
    }

    public final fa b(UnknownFieldSet unknownFieldSet) {
        return (fa)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.w();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.A();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.w();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.A();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.A();
    }

    public /* synthetic */ Message buildPartial() {
        return this.z();
    }

    public /* synthetic */ Message build() {
        return this.y();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.w();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.A();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.z();
    }

    public /* synthetic */ MessageLite build() {
        return this.y();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.w();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.x();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.x();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.A();
    }

    public /* synthetic */ Object clone() {
        return this.A();
    }
}

