package asu.edu.ru.requests.item.data.repository;

import asu.edu.ru.requests.item.data.model.Request;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RequestRepository extends MongoRepository<Request, UUID> {
}
