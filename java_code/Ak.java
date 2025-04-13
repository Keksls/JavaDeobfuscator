/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
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
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

public final class Ak
extends GeneratedMessageV3.Builder<Ak>
implements Al {
    private int a;
    private int b;
    private int c;
    private int d;
    private boolean e;

    public static final Descriptors.Descriptor a() {
        return zy_1.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zy_1.f.ensureFieldAccessorsInitialized(Ai.class, Ak.class);
    }

    Ak() {
        this.s();
    }

    Ak(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.s();
    }

    private void s() {
        if (Ai.p()) {
            // empty if block
        }
    }

    public Ak j() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        this.e = false;
        this.a &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zy_1.e;
    }

    public Ai k() {
        return Ai.m();
    }

    public Ai l() {
        Ai ai = this.m();
        if (!ai.isInitialized()) {
            throw Ak.newUninitializedMessageException((Message)ai);
        }
        return ai;
    }

    public Ai m() {
        Ai ai = new Ai(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        ai.h = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        ai.i = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        ai.j = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        ai.k = this.e;
        ai.g = n2;
        this.onBuilt();
        return ai;
    }

    public Ak n() {
        return (Ak)super.clone();
    }

    public Ak a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (Ak)super.setField(fieldDescriptor, object);
    }

    public Ak a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (Ak)super.clearField(fieldDescriptor);
    }

    public Ak a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (Ak)super.clearOneof(oneofDescriptor);
    }

    public Ak a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (Ak)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public Ak b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (Ak)super.addRepeatedField(fieldDescriptor, object);
    }

    public Ak a(Message message) {
        if (message instanceof Ai) {
            return this.a((Ai)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public Ak a(Ai ai) {
        if (ai == Ai.m()) {
            return this;
        }
        if (ai.b()) {
            this.a(ai.c());
        }
        if (ai.d()) {
            this.b(ai.e());
        }
        if (ai.f()) {
            this.c(ai.g());
        }
        if (ai.h()) {
            this.a(ai.i());
        }
        this.b(Ai.b(ai));
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
        if (!this.f()) {
            return false;
        }
        return this.h();
    }

    public Ak a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        Ai ai = null;
        try {
            ai = (Ai)Ai.e.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ai = (Ai)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ai != null) {
                this.a(ai);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public int c() {
        return this.b;
    }

    public Ak a(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public Ak o() {
        this.a &= 0xFFFFFFFE;
        this.b = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public int e() {
        return this.c;
    }

    public Ak b(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public Ak p() {
        this.a &= 0xFFFFFFFD;
        this.c = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean f() {
        return (this.a & 4) == 4;
    }

    @Override
    public int g() {
        return this.d;
    }

    public Ak c(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public Ak q() {
        this.a &= 0xFFFFFFFB;
        this.d = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean h() {
        return (this.a & 8) == 8;
    }

    @Override
    public boolean i() {
        return this.e;
    }

    public Ak a(boolean bl) {
        this.a |= 8;
        this.e = bl;
        this.onChanged();
        return this;
    }

    public Ak r() {
        this.a &= 0xFFFFFFF7;
        this.e = false;
        this.onChanged();
        return this;
    }

    public final Ak a(UnknownFieldSet unknownFieldSet) {
        return (Ak)super.setUnknownFields(unknownFieldSet);
    }

    public final Ak b(UnknownFieldSet unknownFieldSet) {
        return (Ak)super.mergeUnknownFields(unknownFieldSet);
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
        return this.j();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.n();
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
        return this.j();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.n();
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
        return this.n();
    }

    public /* synthetic */ Message buildPartial() {
        return this.m();
    }

    public /* synthetic */ Message build() {
        return this.l();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.m();
    }

    public /* synthetic */ MessageLite build() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ Object clone() {
        return this.n();
    }
}

