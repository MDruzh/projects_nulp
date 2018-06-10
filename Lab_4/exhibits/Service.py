from flask import Flask, jsonify, abort, make_response, request
from flask_sqlalchemy import SQLAlchemy

app = Flask(__name__)

app.config['SQLALCHEMY_DATABASE_URI'] = 'mysql+pymysql://root:Karpaty14@localhost:3306/iot-test-db'
db = SQLAlchemy(app)


class Exhibit(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(45))
    age = db.Column(db.Integer)
    weight = db.Column(db.Integer)
    origin = db.Column(db.String(45))


@app.route('/exhibits', methods=['GET'])
def get_all_exhibits():
    exhibits = []
    all_exhibits = Exhibit.query.all()
    for mu in all_exhibits:
        exhibit = {
            'name': mu.name,
            'age': mu.age,
            'weight': mu.weight,
            'origin': mu.origin
        }
        exhibits.append(exhibit)
    db.session.commit()
    return jsonify({'exhibits': exhibits})


@app.route('/exhibits/<int:exhibit_id>', methods=['GET'])
def get_exhibit(exhibit_id):
    mu = Exhibit.query.filter_by(id=exhibit_id).first()
    exhibit = {
        'name': mu.name,
        'age': mu.age,
        'weight': mu. weight,
        'origin': mu.origin
    }
    db.session.commit()
    return jsonify({'exhibit': exhibit})


@app.errorhandler(404)
def not_found(error):
    return make_response(jsonify({'error': 'Not found'}), 404)


@app.route('/exhibits', methods=['POST'])
def add_exhibit():
    if not request.json or not 'name' in request.json:
        abort(400)
    new_exhibit = Exhibit()
    new_exhibit.iD = request.json['id']
    new_exhibit.name = request.json['name']
    new_exhibit.age = request.json['age']
    new_exhibit.weight = request.json['weight']
    new_exhibit.origin = request.json.get('origin')

    db.session.add(new_exhibit)
    db.session.commit()
    return jsonify('Successful')


@app.route('/exhibits/<int:exhibit_id>', methods=['PUT'])
def update_exhibit(exhibit_id):
    exhibit = Exhibit.query.get(exhibit_id)

    exhibit.name = request.json['name']
    exhibit.origin = request.json('origin')
    exhibit.age = request.json.get('age', exhibit.age)
    db.session.commit()
    return jsonify('Successful')


@app.route('/exhibits/<int:exhibit_id>', methods=['DELETE'])
def delete_exhibit(exhibit_id):
    mu = Exhibit.query.filter_by(id=exhibit_id).first()
    db.session.delete(mu)
    db.session.commit()
    return jsonify({'result': True})


if __name__ == '__main__':
    app.run(debug=True)