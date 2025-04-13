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

public final class kk
extends GeneratedMessageV3.Builder<kk>
implements kl {
    private int a;
    private int b;
    private boolean c;
    private List<kR> d = Collections.emptyList();
    private RepeatedFieldBuilderV3<kR, kT, kU> e;
    private long f;

    public static final Descriptors.Descriptor a() {
        return kg.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kg.d.ensureFieldAccessorsInitialized(ki.class, kk.class);
    }

    kk() {
        this.v();
    }

    kk(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.v();
    }

    private void v() {
        if (ki.q()) {
            this.x();
        }
    }

    public kk k() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        this.c = false;
        this.a &= 0xFFFFFFFD;
        if (this.e == null) {
            this.d = Collections.emptyList();
            this.a &= 0xFFFFFFFB;
        } else {
            this.e.clear();
        }
        this.f = 0L;
        this.a &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kg.c;
    }

    public ki l() {
        return ki.n();
    }

    public ki m() {
        ki ki2 = this.n();
        if (!ki2.isInitialized()) {
            throw kk.newUninitializedMessageException((Message)ki2);
        }
        return ki2;
    }

    public ki n() {
        ki ki2 = new ki(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        ki2.h = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        ki2.i = this.c;
        if (this.e == null) {
            if ((this.a & 4) == 4) {
                this.d = Collections.unmodifiableList(this.d);
                this.a &= 0xFFFFFFFB;
            }
            ki2.j = this.d;
        } else {
            ki2.j = this.e.build();
        }
        if ((n & 8) == 8) {
            n2 |= 4;
        }
        ki2.k = this.f;
        ki2.g = n2;
        this.onBuilt();
        return ki2;
    }

    public kk o() {
        return (kk)super.clone();
    }

    public kk a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kk)super.setField(fieldDescriptor, object);
    }

    public kk a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (kk)super.clearField(fieldDescriptor);
    }

    public kk a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (kk)super.clearOneof(oneofDescriptor);
    }

    public kk a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (kk)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public kk b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kk)super.addRepeatedField(fieldDescriptor, object);
    }

    public kk a(Message message) {
        if (message instanceof ki) {
            return this.a((ki)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public kk a(ki ki2) {
        if (ki2 == ki.n()) {
            return this;
        }
        if (ki2.b()) {
            this.c(ki2.c());
        }
        if (ki2.d()) {
            this.a(ki2.e());
        }
        if (this.e == null) {
            if (!ki2.j.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = ki2.j;
                    this.a &= 0xFFFFFFFB;
                } else {
                    this.w();
                    this.d.addAll(ki2.j);
                }
                this.onChanged();
            }
        } else if (!ki2.j.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e.dispose();
                this.e = null;
                this.d = ki2.j;
                this.a &= 0xFFFFFFFB;
                this.e = ki.r() ? this.x() : null;
            } else {
                this.e.addAllMessages(ki2.j);
            }
        }
        if (ki2.i()) {
            this.a(ki2.j());
        }
        this.b(ki.b(ki2));
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
        for (int k = 0; k < this.h(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public kk a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ki ki2 = null;
        try {
            ki2 = (ki)ki.e.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ki2 = (ki)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ki2 != null) {
                this.a(ki2);
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

    public kk c(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public kk p() {
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
    public boolean e() {
        return this.c;
    }

    public kk a(boolean bl) {
        this.a |= 2;
        this.c = bl;
        this.onChanged();
        return this;
    }

    public kk q() {
        this.a &= 0xFFFFFFFD;
        this.c = false;
        this.onChanged();
        return this;
    }

    private void w() {
        if ((this.a & 4) != 4) {
            this.d = new ArrayList<kR>(this.d);
            this.a |= 4;
        }
    }

    @Override
    public List<kR> f() {
        if (this.e == null) {
            return Collections.unmodifiableList(this.d);
        }
        return this.e.getMessageList();
    }

    @Override
    public int h() {
        if (this.e == null) {
            return this.d.size();
        }
        return this.e.getCount();
    }

    @Override
    public kR a(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (kR)this.e.getMessage(n);
    }

    public kk a(int n, kR kR2) {
        if (this.e == null) {
            if (kR2 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.d.set(n, kR2);
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)kR2);
        }
        return this;
    }

    public kk a(int n, kT kT2) {
        if (this.e == null) {
            this.w();
            this.d.set(n, kT2.i());
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)kT2.i());
        }
        return this;
    }

    public kk a(kR kR2) {
        if (this.e == null) {
            if (kR2 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.d.add(kR2);
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)kR2);
        }
        return this;
    }

    public kk b(int n, kR kR2) {
        if (this.e == null) {
            if (kR2 == null) {
                throw new NullPointerException();
            }
            this.w();
            this.d.add(n, kR2);
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)kR2);
        }
        return this;
    }

    public kk a(kT kT2) {
        if (this.e == null) {
            this.w();
            this.d.add(kT2.i());
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)kT2.i());
        }
        return this;
    }

    public kk b(int n, kT kT2) {
        if (this.e == null) {
            this.w();
            this.d.add(n, kT2.i());
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)kT2.i());
        }
        return this;
    }

    public kk a(Iterable<? extends kR> iterable) {
        if (this.e == null) {
            this.w();
            AbstractMessageLite.Builder.addAll(iterable, this.d);
            this.onChanged();
        } else {
            this.e.addAllMessages(iterable);
        }
        return this;
    }

    public kk r() {
        if (this.e == null) {
            this.d = Collections.emptyList();
            this.a &= 0xFFFFFFFB;
            this.onChanged();
        } else {
            this.e.clear();
        }
        return this;
    }

    public kk d(int n) {
        if (this.e == null) {
            this.w();
            this.d.remove(n);
            this.onChanged();
        } else {
            this.e.remove(n);
        }
        return this;
    }

    public kT e(int n) {
        return (kT)this.x().getBuilder(n);
    }

    @Override
    public kU b(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (kU)this.e.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends kU> g() {
        if (this.e != null) {
            return this.e.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.d);
    }

    public kT s() {
        return (kT)this.x().addBuilder((AbstractMessage)kR.j());
    }

    public kT f(int n) {
        return (kT)this.x().addBuilder(n, (AbstractMessage)kR.j());
    }

    public List<kT> t() {
        return this.x().getBuilderList();
    }

    private RepeatedFieldBuilderV3<kR, kT, kU> x() {
        if (this.e == null) {
            this.e = new RepeatedFieldBuilderV3(this.d, (this.a & 4) == 4, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.d = null;
        }
        return this.e;
    }

    @Override
    public boolean i() {
        return (this.a & 8) == 8;
    }

    @Override
    public long j() {
        return this.f;
    }

    public kk a(long l) {
        this.a |= 8;
        this.f = l;
        this.onChanged();
        return this;
    }

    public kk u() {
        this.a &= 0xFFFFFFF7;
        this.f = 0L;
        this.onChanged();
        return this;
    }

    public final kk a(UnknownFieldSet unknownFieldSet) {
        return (kk)super.setUnknownFields(unknownFieldSet);
    }

    public final kk b(UnknownFieldSet unknownFieldSet) {
        return (kk)super.mergeUnknownFields(unknownFieldSet);
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
        return this.k();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.o();
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
        return this.k();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.o();
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
        return this.o();
    }

    public /* synthetic */ Message buildPartial() {
        return this.n();
    }

    public /* synthetic */ Message build() {
        return this.m();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.o();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.n();
    }

    public /* synthetic */ MessageLite build() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.k();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.o();
    }

    public /* synthetic */ Object clone() {
        return this.o();
    }
}

