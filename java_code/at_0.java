/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from At
 */
public final class at_0
extends GeneratedMessageV3.Builder<at_0>
implements au_0 {
    private int a;
    private int b;
    private List<kR> c = Collections.emptyList();
    private RepeatedFieldBuilderV3<kR, kT, kU> d;

    public static final Descriptors.Descriptor a() {
        return Am.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Am.d.ensureFieldAccessorsInitialized(ar_0.class, at_0.class);
    }

    at_0() {
        this.p();
    }

    at_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.p();
    }

    private void p() {
        if (ar_0.m()) {
            this.r();
        }
    }

    public at_0 g() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        if (this.d == null) {
            this.c = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
        } else {
            this.d.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return Am.c;
    }

    public ar_0 h() {
        return ar_0.j();
    }

    public ar_0 i() {
        ar_0 ar_02 = this.j();
        if (!ar_02.isInitialized()) {
            throw at_0.newUninitializedMessageException((Message)ar_02);
        }
        return ar_02;
    }

    public ar_0 j() {
        ar_0 ar_02 = new ar_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        ar_02.f = this.b;
        if (this.d == null) {
            if ((this.a & 2) == 2) {
                this.c = Collections.unmodifiableList(this.c);
                this.a &= 0xFFFFFFFD;
            }
            ar_02.g = this.c;
        } else {
            ar_02.g = this.d.build();
        }
        ar_02.e = n2;
        this.onBuilt();
        return ar_02;
    }

    public at_0 k() {
        return (at_0)super.clone();
    }

    public at_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (at_0)super.setField(fieldDescriptor, object);
    }

    public at_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (at_0)super.clearField(fieldDescriptor);
    }

    public at_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (at_0)super.clearOneof(oneofDescriptor);
    }

    public at_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (at_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public at_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (at_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public at_0 a(Message message) {
        if (message instanceof ar_0) {
            return this.a((ar_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public at_0 a(ar_0 ar_02) {
        if (ar_02 == ar_0.j()) {
            return this;
        }
        if (ar_02.b()) {
            this.c(ar_02.c());
        }
        if (this.d == null) {
            if (!ar_02.g.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = ar_02.g;
                    this.a &= 0xFFFFFFFD;
                } else {
                    this.q();
                    this.c.addAll(ar_02.g);
                }
                this.onChanged();
            }
        } else if (!ar_02.g.isEmpty()) {
            if (this.d.isEmpty()) {
                this.d.dispose();
                this.d = null;
                this.c = ar_02.g;
                this.a &= 0xFFFFFFFD;
                this.d = ar_0.n() ? this.r() : null;
            } else {
                this.d.addAllMessages(ar_02.g);
            }
        }
        this.b(ar_0.b(ar_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        for (int k = 0; k < this.f(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public at_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ar_0 ar_02 = null;
        try {
            ar_02 = (ar_0)ar_0.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ar_02 = (ar_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ar_02 != null) {
                this.a(ar_02);
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

    public at_0 c(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public at_0 l() {
        this.a &= 0xFFFFFFFE;
        this.b = 0;
        this.onChanged();
        return this;
    }

    private void q() {
        if ((this.a & 2) != 2) {
            this.c = new ArrayList<kR>(this.c);
            this.a |= 2;
        }
    }

    @Override
    public List<kR> d() {
        if (this.d == null) {
            return Collections.unmodifiableList(this.c);
        }
        return this.d.getMessageList();
    }

    @Override
    public int f() {
        if (this.d == null) {
            return this.c.size();
        }
        return this.d.getCount();
    }

    @Override
    public kR a(int n) {
        if (this.d == null) {
            return this.c.get(n);
        }
        return (kR)this.d.getMessage(n);
    }

    public at_0 a(int n, kR kR2) {
        if (this.d == null) {
            if (kR2 == null) {
                throw new NullPointerException();
            }
            this.q();
            this.c.set(n, kR2);
            this.onChanged();
        } else {
            this.d.setMessage(n, (AbstractMessage)kR2);
        }
        return this;
    }

    public at_0 a(int n, kT kT2) {
        if (this.d == null) {
            this.q();
            this.c.set(n, kT2.i());
            this.onChanged();
        } else {
            this.d.setMessage(n, (AbstractMessage)kT2.i());
        }
        return this;
    }

    public at_0 a(kR kR2) {
        if (this.d == null) {
            if (kR2 == null) {
                throw new NullPointerException();
            }
            this.q();
            this.c.add(kR2);
            this.onChanged();
        } else {
            this.d.addMessage((AbstractMessage)kR2);
        }
        return this;
    }

    public at_0 b(int n, kR kR2) {
        if (this.d == null) {
            if (kR2 == null) {
                throw new NullPointerException();
            }
            this.q();
            this.c.add(n, kR2);
            this.onChanged();
        } else {
            this.d.addMessage(n, (AbstractMessage)kR2);
        }
        return this;
    }

    public at_0 a(kT kT2) {
        if (this.d == null) {
            this.q();
            this.c.add(kT2.i());
            this.onChanged();
        } else {
            this.d.addMessage((AbstractMessage)kT2.i());
        }
        return this;
    }

    public at_0 b(int n, kT kT2) {
        if (this.d == null) {
            this.q();
            this.c.add(n, kT2.i());
            this.onChanged();
        } else {
            this.d.addMessage(n, (AbstractMessage)kT2.i());
        }
        return this;
    }

    public at_0 a(Iterable<? extends kR> iterable) {
        if (this.d == null) {
            this.q();
            AbstractMessageLite.Builder.addAll(iterable, this.c);
            this.onChanged();
        } else {
            this.d.addAllMessages(iterable);
        }
        return this;
    }

    public at_0 m() {
        if (this.d == null) {
            this.c = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.d.clear();
        }
        return this;
    }

    public at_0 d(int n) {
        if (this.d == null) {
            this.q();
            this.c.remove(n);
            this.onChanged();
        } else {
            this.d.remove(n);
        }
        return this;
    }

    public kT e(int n) {
        return (kT)this.r().getBuilder(n);
    }

    @Override
    public kU b(int n) {
        if (this.d == null) {
            return this.c.get(n);
        }
        return (kU)this.d.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends kU> e() {
        if (this.d != null) {
            return this.d.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.c);
    }

    public kT n() {
        return (kT)this.r().addBuilder((AbstractMessage)kR.j());
    }

    public kT f(int n) {
        return (kT)this.r().addBuilder(n, (AbstractMessage)kR.j());
    }

    public List<kT> o() {
        return this.r().getBuilderList();
    }

    private RepeatedFieldBuilderV3<kR, kT, kU> r() {
        if (this.d == null) {
            this.d = new RepeatedFieldBuilderV3(this.c, (this.a & 2) == 2, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    public final at_0 a(UnknownFieldSet unknownFieldSet) {
        return (at_0)super.setUnknownFields(unknownFieldSet);
    }

    public final at_0 b(UnknownFieldSet unknownFieldSet) {
        return (at_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.g();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.k();
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
        return this.g();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.k();
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
        return this.k();
    }

    public /* synthetic */ Message buildPartial() {
        return this.j();
    }

    public /* synthetic */ Message build() {
        return this.i();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.j();
    }

    public /* synthetic */ MessageLite build() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ Object clone() {
        return this.k();
    }
}

