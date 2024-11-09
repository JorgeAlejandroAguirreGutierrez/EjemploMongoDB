/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebamongodb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gt;
import static com.mongodb.client.model.Sorts.ascending;
import static com.mongodb.client.model.Updates.set;
import java.util.Arrays;
import org.bson.Document;

/**
 *
 * @author joaaguir
 */
public class PruebaMongoDB {

    public static void main(String[] args) {
        String uri = "mongodb://localhost:27017";
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase("pruebas");
        System.out.println("CONEXION EXITOISA");
        MongoCollection<Document> collection = database.getCollection("usuarios");
        
        //INSERTANDO UN DOCUMENTO
        //Document documento = new Document("nombre", "MARIA").append("edad", 22).append("ciudad", "BARCELONA");
        //collection.insertOne(documento);
        
        //INSERTANDO MULTIPLES DOCUMENTOS
        //Document documento1 = new Document("nombre", "LUISA").append("edad", 30).append("ciudad", "GIRONA");
        //Document documento2 = new Document("nombre", "GEOVANNY").append("edad", 35).append("ciudad", "MADRID");
        //collection.insertMany(Arrays.asList(documento1, documento2));
        
        //CONSULTAR LOS DOCUMENTOS
        //MongoCursor<Document> cursor = collection.find().iterator();
        //while(cursor.hasNext()){
        //    System.out.println(cursor.next().toJson());
        //}
        
        //ACTUALIZAR UN DOCUMENTO
        //collection.updateOne(eq("nombre", "LAURA"), set("edad", "19"));
        
        //ELIMINAR UN DOCUMENTO
        //collection.deleteOne(eq("nombre", "LAURA"));
        
        //TRAER UN SOLO DOCUMENTO
        //Document resultado = collection.find(eq("nombre", "JUAN")).first();
        //System.out.println(resultado.toJson());
        
        //CONSULTA DE DOCUMENTOS CON FILTROS
        //MongoCursor<Document> cursor = collection.find(and(eq("ciudad", "MADRID"), gt("edad", 19))).iterator();
        //while(cursor.hasNext()){
        //    System.out.println(cursor.next().toJson());
        //}
        
        //CONSULTA PARA ORDENAR Y LIMITAR
        //MongoCursor<Document> cursor = collection.find(eq("ciudad", "MADRID")).sort(ascending("edad")).limit(5).iterator();
        //while(cursor.hasNext()){
        //    System.out.println(cursor.next().toJson());
        //}
        mongoClient.close();
    }
}
