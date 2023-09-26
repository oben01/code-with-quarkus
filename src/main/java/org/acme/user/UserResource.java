package org.acme.user;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.bson.types.ObjectId;

import java.net.URI;
import java.net.URISyntaxException;

@Path("/users")
@ApplicationScoped
public class UserResource {

    @Inject
    UserRepository userRepository;

    @GET
    public Response getAllUsers() {
        return Response.ok(userRepository.listAll()).build();
    }

    @POST
    public Response create(User user) throws URISyntaxException {
        userRepository.persist(user);
        return Response.created(new URI("/" + user.id)).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") String id) {
        User user = userRepository.findById(new ObjectId(id));
        userRepository.delete(user);
        return Response.noContent().build();
    }
}
